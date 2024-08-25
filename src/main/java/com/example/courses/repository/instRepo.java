package com.example.courses.repository;




import com.example.courses.modal.CourseDelivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface instRepo extends JpaRepository<CourseDelivery,Integer> {
    List<CourseDelivery> findByYearAndSemester(int year, int semester);

    Optional<CourseDelivery> findByYearAndSemesterAndId(int year, int semester, Long id);


}
