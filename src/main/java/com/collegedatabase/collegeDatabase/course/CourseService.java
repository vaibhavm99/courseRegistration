package com.collegedatabase.collegeDatabase.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseRepository courseRepository;
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseFromId(String id) {
        return courseRepository.findAllByCourseID(id);
    }

    public List<Course> getCourseFromName(String name) {
        return courseRepository.findAllByCourseName(name);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String courseID) {
        courseRepository.deleteById(courseID);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }
}
