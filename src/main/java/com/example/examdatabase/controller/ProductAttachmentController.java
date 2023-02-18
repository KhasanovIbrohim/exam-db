package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Product_attachment;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/productattachment")
public interface ProductAttachmentController {
    @PostMapping("/add")
    ResultMessage addProduct_attachment(@RequestBody Product_attachment productAttachment);
    @PutMapping("/edit/{id}")
    ResultMessage editProduct_attachment(@PathVariable Integer id, @RequestBody Product_attachment productAttachment);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteProduct_attachment(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Product_attachment showProduct_attachment(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Product_attachment> showProduct_attachments();
}
