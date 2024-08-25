package com.example.courses.controller;

import com.example.courses.modal.Course;
import com.example.courses.repository.courseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class courseController {
    @Autowired
    private final courseRepo repository;

    public courseController (courseRepo repository){
        this.repository=repository;
    }
    @PostMapping("/api/courses")
    public Course addCourse(@RequestBody Course course){
        return repository.save(course);
    }
    @GetMapping("/api")
    public List<Course> getAll(){
        return repository.findAll();
    }
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
//
//
//
//@GetMapping("/api/courses")
//public ResponseEntity<List<Course>> allCourse(){
//try{
//    List<Course> courList= new ArrayList<>();
//    repository.findAll().forEach(courList::add);
//    if (courList.isEmpty()){
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//    return new ResponseEntity<>( HttpStatus.OK);
//}catch(Exception ex){
//    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
//
//
//@GetMapping("/api/courses/{id}")
//public ResponseEntity<Course> getCoursebyID(@PathVariable Long id){
//   Optional<Course> courseData=repository.findById(id);
//
//   if(courseData.isPresent())
//   {    return new ResponseEntity<>(courseData.get(), HttpStatus.OK);
//    }
//    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//}
//
//
//@DeleteMapping("/api/courses/{id}")
//public ResponseEntity<HttpStatus> delCourse(@PathVariable Long id){
//    repository.deleteById(id);
//    return new ResponseEntity<>(HttpStatus.OK);
//
//}

