package com.example.examdatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Products {
    @Id
    private Integer id;
    private String name;
    @ManyToOne
    private Category categoryId;
    private Integer photoId;
    private String code;
    @ManyToOne
    private Measurement measurement;
    private Boolean is_active;
    private Date date;
}
