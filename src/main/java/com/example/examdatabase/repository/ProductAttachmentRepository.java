package com.example.examdatabase.repository;

import com.example.examdatabase.entity.Product_attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductAttachmentRepository extends JpaRepository<Product_attachment, Integer> {
}
