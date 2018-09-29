package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student);
    public void deleteStudent(Integer id);
    public void updateStudent(Student student);
    public Student findStudent(Integer id);
    public List<Student> findAllStudent();

}

