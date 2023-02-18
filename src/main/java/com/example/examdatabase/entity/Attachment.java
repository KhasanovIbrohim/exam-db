package com.example.examdatabase.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Attachment {
    @Id
    private Integer id;
    private String original_name;
    private Integer size;
    private String content_type;
    private Integer file_id;
}
