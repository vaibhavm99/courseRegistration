package com.collegedatabase.collegeDatabase.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private List<Student> students;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    private StudentRepository studentRepository;


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
//        return students;
//        List<Student> students = new ArrayList<>();
//        studentRepository.findAll().forEach(students::add);
//        return students;
    }

    public Student getStudentsByID(String id) {
        if (studentRepository.findAllById(id).size() == 0)
        {
            return  new Student("No such Level Exists", "-1", "N/A", new ArrayList<>());
        }
        else
        {
            return  (Student) studentRepository.findAllById(id).get(0);
        }

    }

    public List<Student> getStudentsByLevel(String level) {
        return studentRepository.findAllByLevel(level);

        //        List<Student> studentList = new ArrayList<Student>();
//        for (int i = 0; i < this.students.size(); i++) {
//            if (this.students.get(i).getLevel().equals(level))
//                studentList.add(this.students.get(i));
//        }
//        if (studentList.size() == 0)
//            return Arrays.asList(new Student("No such Level Exists", "-1", "N/A"));
//        return studentList;
    }

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findAllByName(name);
    }

    public void addStudent(Student student) {
//        this.students.add(student);
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
//        for (int i = 0; i < this.students.size(); i++) {
//            if(this.students.get(i).getId().equals(id))
//                this.students.remove(i);
//        }
        studentRepository.deleteById(id);
    }

    public void updateStudent(String id, Student student) {
//        for (int i = 0; i < this.students.size(); i++) {
//            if(this.students.get(i).getId().equals(id))
//            {
//                this.students.get(i).updateRecord(student);
//            }
//        }
        studentRepository.save(student);
    }
}
