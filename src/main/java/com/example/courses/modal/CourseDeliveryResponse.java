package com.example.courses.modal;

public class CourseDeliveryResponse {

    private String courseTitle;
    private int year;
    private int semester;
    private String courseCode;
    private String courseDescription;

    // Constructor, getters, and setters

    public CourseDeliveryResponse(String courseTitle, int year, int semester, String courseCode, String courseDescription) {
        this.courseTitle = courseTitle;
        this.year = year;
        this.semester = semester;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
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

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}