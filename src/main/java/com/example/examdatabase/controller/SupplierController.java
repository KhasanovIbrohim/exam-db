package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Supplier;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/supplier")
public interface SupplierController {
    @PostMapping("/add")
    ResultMessage addSupplier(@RequestBody Supplier supplier);
    @PutMapping("/edit/{id}")
    ResultMessage editSupplier(@PathVariable Integer id, @RequestBody Supplier supplier);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteSupplier(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Supplier showSupplier(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Supplier> showSuppliers();
}
