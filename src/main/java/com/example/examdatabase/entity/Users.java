package com.example.examdatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String code;
    private String password;
    private Boolean is_active;
    private String role;
}
