package com.example.courses.controller;

import com.example.courses.modal.CourseDelivery;
import com.example.courses.service.CourseDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instances")
public class CourseDeliveryController {

    @Autowired
    private CourseDeliveryService courseDeliveryService;

    @PostMapping
    public CourseDelivery createCourseDelivery(@RequestBody CourseDelivery courseDelivery) {
        return courseDeliveryService.createCourseDelivery(courseDelivery);
    }

    @GetMapping("/{year}/{semester}")
    public List<CourseDelivery> getCourseDeliveriesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseDeliveryService.getCourseDeliveriesByYearAndSemester(year, semester);
    }

    @GetMapping("/{year}/{semester}/{id}")
    public CourseDelivery getCourseDeliveryById(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        return courseDeliveryService.getCourseDeliveryById(year, semester, id);
    }

    @DeleteMapping("/{year}/{semester}/{id}")
    public ResponseEntity<Void> deleteCourseDelivery(@PathVariable int year, @PathVariable int semester, @PathVariable Long id) {
        courseDeliveryService.deleteCourseDelivery(year, semester, id);
        return ResponseEntity.noContent().build();
    }
}