package com.collegedatabase.collegeDatabase.student;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Student {
    private String name;
   @Id
    private String id;
    private String level;

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    private List<String> courseList;

    public Student() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Student(String name, String id, String level, List<String> courseList) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.courseList = courseList;
    }

    public void updateRecord(Student student) {
        this.name = student.getName();
        this.level = student.getLevel();
        this.courseList = student.getCourseList();
    }
}
