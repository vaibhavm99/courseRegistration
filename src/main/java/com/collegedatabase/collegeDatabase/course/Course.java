package com.collegedatabase.collegeDatabase.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    String courseID;
    String courseName;
    String description;

    public Course() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    String level;


    public Course(String courseID) {
        this.courseID = courseID;
    }

    public Course(String courseID, String courseName, String description, String level) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.level = level;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
