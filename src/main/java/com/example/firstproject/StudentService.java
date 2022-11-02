package com.example.firstproject;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    public Optional<Student> getById(String id){

        return studentRepository.findById(id);
    }

    public Student saveStudents(Student student){

        return  studentRepository.save(student);

    }

    public void deleteStudent(String id){
         studentRepository.deleteById(id);

    }

    public Optional<Student> updateStudent(Student student, String id){
        return studentRepository.findById(id)
                .map(student1->{
                    student1.setFirstname(student.getFirstname());
                    student1.setLastname(student.getLastname());
                    student1.setAddress(student.getAddress());
                    student1.setEmail(student.getEmail());
                    student1.setGender(student.getGender());
                    return studentRepository.save(student1);
                });
    }



}
