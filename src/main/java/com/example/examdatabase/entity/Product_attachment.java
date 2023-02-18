package com.example.examdatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product_attachment {
    @Id
    private Integer productId;
    @ManyToOne
    private Attachment attachment;
}
