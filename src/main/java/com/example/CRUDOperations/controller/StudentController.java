package com.example.CRUDOperations.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUDOperations.entity.Student;
import com.example.CRUDOperations.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // create student
    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    // read one student
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student studentResp = studentService.getStudent(id);
        if (studentResp == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(studentResp);
    }

    // read all students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentsResp = studentService.getAllStudents();
        if (studentsResp.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(studentsResp);
    }

    // update student

    // delete student
}
