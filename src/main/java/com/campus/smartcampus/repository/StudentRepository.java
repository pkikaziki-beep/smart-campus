package com.campus.smartcampus.repository;
import com.campus.smartcampus.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {}