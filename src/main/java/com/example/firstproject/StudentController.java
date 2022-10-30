package com.example.firstproject;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/Students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();

    }

    @GetMapping("student/{id}")
    public Optional<Student> fetchById(@PathVariable String id){
        return studentService.getById(id);
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student newStudent){
        return studentService.saveStudents(newStudent);

    }

}
