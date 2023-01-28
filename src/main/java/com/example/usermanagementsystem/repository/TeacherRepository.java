package com.example.usermanagementsystem.repository;

import com.example.usermanagementsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query(value = "select * from Teacher where Teacher.TEACHER_id=?1", nativeQuery = true)
    Teacher findTeacherById(Long id);
}
