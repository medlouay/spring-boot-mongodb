package com.example.firstproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Address {
    private String country;
    private String city;
    private String postCode;

}
