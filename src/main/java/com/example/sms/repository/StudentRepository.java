package com.example.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sms.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findAllByFirstNameAndEmail(String firstName, String email);
    List<Student> findAllByFirstName(String firstName);

}
