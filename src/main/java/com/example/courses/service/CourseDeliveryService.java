package com.example.courses.service;

import com.example.courses.modal.CourseDelivery;
import com.example.courses.repository.instRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDeliveryService {

    @Autowired
    private instRepo courseDeliveryRepository;

    public CourseDelivery createCourseDelivery(CourseDelivery courseDelivery) {
        return courseDeliveryRepository.save(courseDelivery);
    }

    public List<CourseDelivery> getCourseDeliveriesByYearAndSemester(int year, int semester) {
        return courseDeliveryRepository.findByYearAndSemester(year, semester);
    }

    public CourseDelivery getCourseDeliveryById(int year, int semester, Long id) {
        return courseDeliveryRepository.findByYearAndSemesterAndId(year, semester, id).orElse(null);
    }

    public void deleteCourseDelivery(int year, int semester, Long id) {
        courseDeliveryRepository.deleteByYearAndSemesterAndId(year, semester, id);
    }
}