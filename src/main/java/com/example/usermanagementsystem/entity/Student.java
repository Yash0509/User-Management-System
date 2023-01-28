package com.example.usermanagementsystem.entity;

import javax.persistence.*;


@Entity
@Table(name = "STUDENT")
public class Student {
        @Id
        @Column(name = "STUDENT_ID")
        private Long studentId;
        @Column(name = "STUDENT_NAME")
        private String studentName;
        @Column(name = "STUDENT_ADDRESS")
        private String studentAddress;
        @Column(name = "STUDENT_BRANCH")
        private String studentBranch;
        @Column(name = "STUDENT_PASSWORD")
        private String studentPassword;

        public Student() {
        }

        public Student(Long studentId, String studentName, String studentAddress, String studentBranch, String studentPassword) {
                this.studentId = studentId;
                this.studentName = studentName;
                this.studentAddress = studentAddress;
                this.studentBranch = studentBranch;
                this.studentPassword = studentPassword;
        }

        public Long getStudentId() {
                return studentId;
        }

        public void setStudentID(Long studentId) {
                this.studentId = studentId;
        }

        public String getStudentName() {
                return studentName;
        }

        public void setStudentName(String studentName) {
                this.studentName = studentName;
        }

        public String getStudentAddress() {
                return studentAddress;
        }

        public void setStudentAddress(String studentAddress) {
                this.studentAddress = studentAddress;
        }

        public String getStudentBranch() {
                return studentBranch;
        }

        public void setStudentBranch(String studentBranch) {
                this.studentBranch = studentBranch;
        }

        public String getStudentPassword() {
                return studentPassword;
        }

        public void setStudentPassword(String studentPassword) {
                this.studentPassword = studentPassword;
        }
}
