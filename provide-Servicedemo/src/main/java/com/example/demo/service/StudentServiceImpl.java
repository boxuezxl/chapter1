package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
        // TODO Auto-generated method stub
        studentDao.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        // TODO Auto-generated method stub
        studentDao.deleteById(id);

    }

    @Override
    public void updateStudent(Student student) {
        // TODO Auto-generated method stub
        studentDao.save(student);
    }

    @Override
    public Student findStudent(Integer id) {
        // TODO Auto-generated method stub
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAllStudent() {
        // TODO Auto-generated method stub
        return studentDao.findAll();

    }

}

