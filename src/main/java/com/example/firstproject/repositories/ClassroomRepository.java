package com.example.firstproject.repositories;

import com.example.firstproject.entities.Classroom;
import com.example.firstproject.entities.Student;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassroomRepository  extends MongoRepository<Classroom,Long> {
    Classroom findByName(String name);
}
