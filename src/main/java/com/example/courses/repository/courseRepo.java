package com.example.courses.repository;

import com.example.courses.modal.Course;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo extends JpaRepository<Course, Long> {
}
