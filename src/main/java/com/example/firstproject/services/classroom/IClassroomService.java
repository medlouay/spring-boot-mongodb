package com.example.firstproject.services.classroom;

import com.example.firstproject.entities.Classroom;

public interface IClassroomService {
    Classroom findById(Long id);
}
