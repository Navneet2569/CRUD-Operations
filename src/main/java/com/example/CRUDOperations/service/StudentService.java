package com.example.CRUDOperations.service;

import java.util.List;
import java.util.Optional;

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
        Student studentResp = studentRepository.save(studentReq);
        return studentResp;
    }

    public Student getStudent(Long id) {
        Optional<Student> studentResp = studentRepository.findById(id);
        if (studentResp.isPresent()) {
            return studentResp.get();
        }
        return null;
    }

    public List<Student> getAllStudents() {
        List<Student> studentsResp = studentRepository.findAll();
        return studentsResp;
    }

}
