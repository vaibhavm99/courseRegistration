package com.collegedatabase.collegeDatabase.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses()
    {

        return courseService.getAllCourses();
    }

    @RequestMapping("/course/{courseID}")
    public Course getCourseFromId(@PathVariable String courseID)
    {
        return courseService.getCourseFromId(courseID);
    }

    @RequestMapping("/course/name/{name}")
    public List<Course> getCourseFromName(@PathVariable String name)
    {
        return courseService.getCourseFromName(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/course")
    public String addCourse(@RequestBody Course course)
    {
        courseService.addCourse(course);
        return "Successfully added " + course.getCourseID();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/course/{courseID}")
    public String deleteCourse(@PathVariable String courseID)
    {
        courseService.deleteCourse(courseID);
        return "Successfully deleted " + courseID;
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/course/{courseID}")
    public String updateCourse(@RequestBody Course course, @PathVariable String courseID)
    {
        courseService.updateCourse(course);
        return "Successfully Updated " + courseID;
    }

}
