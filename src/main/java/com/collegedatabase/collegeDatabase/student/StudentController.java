package com.collegedatabase.collegeDatabase.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @RequestMapping("/student/id/{id}")
    public Student filterByID(@PathVariable String id)
    {
        return studentService.getStudentsByID(id);
    }

    @RequestMapping("/student/level/{level}")
    public List<Student> filterByLevel(@PathVariable String level)
    {
        return studentService.getStudentsByLevel(level);
    }

    @RequestMapping("/student/name/{name}")
    public List<Student> filterByName(@PathVariable String name)
    {
        return studentService.getStudentsByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/student")
    public String addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return "Successfully added ".concat(student.getName());
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/student/{id}")
    public String deleteStudent(@PathVariable String id)
    {
        String studentID = studentService.getStudentsByID(id).getName();
        studentService.deleteStudent(id);
        return "Successfully Deleted ".concat(studentID);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/student/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable String id)
    {
        String studentID = studentService.getStudentsByID(id).getName();
        studentService.updateStudent(id, student);
        return "Successfully Updated the records of ".concat(studentID);
    }

}
