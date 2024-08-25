package com.example.courses.controller;

import com.example.courses.modal.Course;
import com.example.courses.modal.CourseDelivery;
import com.example.courses.modal.CourseDeliveryResponse;
import com.example.courses.repository.instRepo;
import com.example.courses.service.CourseDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api/instances")
public class CourseDeliveryController {

    @Autowired
    private CourseDeliveryService courseDeliveryService;
    @Autowired
    private instRepo repo;


    @PostMapping
    public CourseDelivery createCourseDelivery(@RequestBody CourseDelivery courseDelivery) {
        return courseDeliveryService.createCourseDelivery(courseDelivery);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseDelivery> getCourseDeliveriesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseDeliveryService.getCourseDeliveriesByYearAndSemester(year, semester);
    }


    @DeleteMapping("/{year}/{semester}/{id}")
    public String deleteCourseDelivery(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        courseDeliveryService.deleteCourseDelivery(year, semester, id);
        return "success";
    }
}