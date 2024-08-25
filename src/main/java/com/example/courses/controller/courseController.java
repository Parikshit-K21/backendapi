package com.example.courses.controller;

import com.example.courses.modal.Course;
import com.example.courses.repository.courseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin("http://localhost:3000/")
public class courseController {
    @Autowired
    private final courseRepo repository;


    public courseController (courseRepo repository){
        this.repository=repository;
    }
//    Update the courses
    @PostMapping("/api/courses")
    public Course addCourse(@RequestBody Course course){
        return repository.save(course);
    }
//    Show all the courses
    @GetMapping("/api/courses")
    public List<Course> getAll(){
        return repository.findAll();
    }

    @GetMapping("/api/courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Optional<Course> optionalCourse = repository.findById(id);
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            return ResponseEntity.ok(course); // Return course with OK status code
        } else {
            return ResponseEntity.notFound().build(); // Return Not Found status code
        }
    }

// update the body of the given id
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id,@RequestBody Course course){
        Course existC= repository.findById(id).get();
        existC.setTitle(course.getTitle());
        existC.setCourseCode(course.getCourseCode());
        existC.setDesc(course.getDesc());
        return repository.save(existC);
    }
    @DeleteMapping("/{id}")
    public String delCourse(@PathVariable long id){
    try{
        repository.deleteById(id);
        return "SUccess";
    }catch(Exception e){
            return "not found";
        }
    }

}
