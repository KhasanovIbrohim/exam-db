package com.example.examdatabase.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    private Integer id;
    private String name;
    @ManyToOne
    private Category categoryId;
    private Boolean is_active;
}
