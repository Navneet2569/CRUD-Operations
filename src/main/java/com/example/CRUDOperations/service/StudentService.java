package com.example.CRUDOperations.service;

import org.springframework.stereotype.Service;

import com.example.CRUDOperations.entity.Student;
import com.example.CRUDOperations.repository.StudentRepository;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        System.out.println("Inside Student Service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        return studentResp;
    }

}
