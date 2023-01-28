package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.entity.Student;
import com.example.usermanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student tmpStudent){
        studentService.saveStudent(tmpStudent);
    }

}
