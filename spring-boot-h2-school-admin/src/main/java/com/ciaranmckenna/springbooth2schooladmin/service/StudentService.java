package com.ciaranmckenna.springbooth2schooladmin.service;

import com.ciaranmckenna.springbooth2schooladmin.model.Student;
import com.ciaranmckenna.springbooth2schooladmin.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRespository studentRepository;

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }
}
