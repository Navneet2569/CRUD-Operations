package com.example.CRUDOperations.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUDOperations.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByIdAndDeletedIsFalse(Long id);

    List<Student> findAllAndDeletedIsFalse();
}
