package com.example.sms.service;

import java.util.List;

import com.example.sms.entity.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentsByFirstNameAndEmail(String firstName, String email);

    List<Student> getAllByFirstName(String firstName);

    Student saveStudent(Student student);

    Student getStudentById(Long studentId);

    Student updateStudent(Student student);

    void deleteStudent(Long studentId);
}
