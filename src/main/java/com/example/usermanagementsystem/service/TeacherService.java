package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.entity.Teacher;
import com.example.usermanagementsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher findByTeacherId(Long id){
        Long new_id = 100 + id;
        Teacher teacher = teacherRepository.findTeacherById(new_id);
        System.out.println("Teacher is "+teacher.getTeacherName());
        return teacher;
    }

    public void saveTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }
}
