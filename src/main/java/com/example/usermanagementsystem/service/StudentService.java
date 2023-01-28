package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.entity.Student;
import com.example.usermanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Student getStudentById(Long studentId){
        Long newStudentId=studentId+100;
        return studentRepository.getStudentById(newStudentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void saveStudent(Student tmpStudent) {
        studentRepository.save(tmpStudent);
    }
}
