package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Warehouse;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/warehouse")
public interface WarehouseController {
    @PostMapping("/signUp")
    ResultMessage addWarehouse(@RequestBody Warehouse warehouse);
    @PutMapping("/edit/{id}")
    ResultMessage editWarehouse(@PathVariable Integer id, @RequestBody Warehouse warehouse);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteWarehouse(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Warehouse showWarehouse(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Warehouse> showWarehouses();
}
