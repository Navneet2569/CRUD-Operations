package com.example.CRUDOperations.repository;

import org.springframework.stereotype.Repository;

import com.example.CRUDOperations.entity.Student;

@Repository
public class StudentRepository {

    public Student saveStudent(Student studentReq) {
        System.out.println("Inside Student Repository");
        return studentReq;
    }

}
