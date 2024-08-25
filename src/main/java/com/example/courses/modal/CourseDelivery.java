package com.example.courses.modal;

import jakarta.persistence.*;

import java.util.List;


@Entity

public class CourseDelivery {

    @Id
    private Long id;
    private int year;
    private int semester;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "CourseDelivery{" +
                "id=" + id +

                ", year=" + year +
                ", semester=" + semester +
                '}';
    }
}