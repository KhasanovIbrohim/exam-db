package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Warehouse;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.WarehouseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class WarehouseControllerImpl implements WarehouseController{
    final WarehouseServiceImpl warehouseService;
    @Override
    public ResultMessage addWarehouse(Warehouse warehouse) {
        return null;
    }

    @Override
    public ResultMessage editWarehouse(Integer id, Warehouse warehouse) {
        return null;
    }

    @Override
    public ResultMessage deleteWarehouse(Integer id) {
        return null;
    }

    @Override
    public Warehouse showWarehouse(Integer id) {
        return null;
    }

    @Override
    public List<Warehouse> showWarehouses() {
        return null;
    }
}
