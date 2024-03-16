package com.collegedatabase.collegeDatabase.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, String> {
    Course findAllByCourseID(String id);

    List<Course> findAllByCourseName(String name);
}
