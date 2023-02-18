package com.example.examdatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Warehouse_UserId {
    @Id
    private Integer wearhouseId;
    @ManyToOne
    private Users userId;

}
