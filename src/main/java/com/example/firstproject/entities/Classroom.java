package com.example.firstproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClassroom;
    @Column(unique = true)
    private String name;
    @OneToMany()
    @JoinColumn(name = "idClassroom")
    List<Student> students;
}
