package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Warehouse_UserId;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/warehouseuser")
public interface WarehouseUserController {
    @PostMapping("/signUp")
    ResultMessage addWarehouse_UserId(@RequestBody Warehouse_UserId warehouseUserId);
    @PutMapping("/edit/{id}")
    ResultMessage editWarehouse_UserId(@PathVariable Integer id, @RequestBody Warehouse_UserId warehouseUserId);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteWarehouse_UserId(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Warehouse_UserId showWarehouse_UserId(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Warehouse_UserId> showWarehouse_UserIds();
}
