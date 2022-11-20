package com.example.firstproject.services.student;

import com.example.firstproject.entities.Student;
import com.example.firstproject.repositories.StudentRepository;
import com.example.firstproject.services.ICrudService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class StudentService implements IStudentService, ICrudService< Student,Long> {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student add(Student student) throws Exception {
        if(studentRepository.findByEmail(student.getEmail()) != null)
            throw new Exception("Student already exists");
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        if(studentRepository.findById(id).isPresent()){
            Student toUpdateStudent = studentRepository.findById(id).get();
            toUpdateStudent.setFirstname(student.getFirstname());
            toUpdateStudent.setLastname(student.getLastname());
            toUpdateStudent.setEmail(student.getEmail());
            toUpdateStudent.setGender(student.getGender());
            toUpdateStudent.setAddress(student.getAddress());
            toUpdateStudent.setFavouriteSubjects(student.getFavouriteSubjects());
            toUpdateStudent.setTotalSpentInBooks(student.getTotalSpentInBooks());
            toUpdateStudent.setClassroom(student.getClassroom());
            return studentRepository.save(toUpdateStudent);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

}
