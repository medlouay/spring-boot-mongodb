package com.example.firstproject.services.student;

import com.example.firstproject.entities.Student;

public interface IStudentService {
    Student findById(Long id);
}
