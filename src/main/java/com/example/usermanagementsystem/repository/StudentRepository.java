package com.example.usermanagementsystem.repository;

import com.example.usermanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(value = "Select * from STUDENT where student_id=?1",nativeQuery = true)
    public Student getStudentById(Long studentId);

    @Query(value = "Select * from STUDENT",nativeQuery = true)
    public List<Student> getAllStudents();

//    @Query(value = "Insert Into Student_Table values=?1",nativeQuery = true)
//    void postStudentById(Student tmpStudent);
}
