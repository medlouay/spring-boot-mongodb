package com.example.firstproject.repositories;

import com.example.firstproject.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface StudentRepository extends MongoRepository<Student,Long> {
    Student findByEmail(String email);

}
