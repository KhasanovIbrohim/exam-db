package com.example.examdatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Supplier {
    @Id
    private Integer id;
    private String name;
    private String phoneNumber;
    private Boolean is_active;
}
