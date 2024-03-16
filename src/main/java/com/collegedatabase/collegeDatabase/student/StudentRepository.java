package com.collegedatabase.collegeDatabase.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {


    List<Student> findAllById(String id);

    List<Student> findAllByLevel(String level);

    List<Student> findAllByName(String name);
}
