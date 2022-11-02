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
    @GetMapping("/allStudents")
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();

    }

    @GetMapping("/getstudentById/{id}")
    public Optional<Student> fetchById(@PathVariable String id){
        return studentService.getById(id);
    }

    @PostMapping("/addStudent")
    public Student save(@RequestBody Student newStudent){
        return studentService.saveStudents(newStudent);

    }

    @DeleteMapping("/deleteStudent/{id}")
    void deleteById(@PathVariable String id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/updateStudent/{id}")
   public Optional<Student> updatestudent(@RequestBody Student student,@PathVariable String id){
        return studentService.updateStudent(student,id);
    }

}
