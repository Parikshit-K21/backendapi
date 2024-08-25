package com.example.courses.modal;


import jakarta.persistence.*;

@Entity

public class Course {

    @Id
    long id;

    private String title;
    private String courseCode;
    private String description;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }



    public Course(){

    }

    public Course(long id, String title, String courseCode, String desc) {
        this.id = id;
        this.title = title;
        this.courseCode = courseCode;
        this.description = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }


}
