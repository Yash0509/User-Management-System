package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.entity.Teacher;
import com.example.usermanagementsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacher/{id}")
    public Teacher getByTeacherId(@PathVariable Long id){
        return teacherService.findByTeacherId(id);
    }

    @PostMapping("/teacher")
    public void saveTeacher(Teacher teacher){
//        System.out.println(teacher.getTeacherName());
        teacherService.saveTeacher(teacher);
    }
}