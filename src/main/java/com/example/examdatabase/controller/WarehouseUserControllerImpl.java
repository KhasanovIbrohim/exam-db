package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Warehouse_UserId;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.WarehouseUserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class WarehouseUserControllerImpl implements WarehouseUserController{
    final WarehouseUserServiceImpl warehouseUserService;
    @Override
    public ResultMessage addWarehouse_UserId(Warehouse_UserId warehouseUserId) {
        return null;
    }

    @Override
    public ResultMessage editWarehouse_UserId(Integer id, Warehouse_UserId warehouseUserId) {
        return null;
    }

    @Override
    public ResultMessage deleteWarehouse_UserId(Integer id) {
        return null;
    }

    @Override
    public Warehouse_UserId showWarehouse_UserId(Integer id) {
        return null;
    }

    @Override
    public List<Warehouse_UserId> showWarehouse_UserIds() {
        return null;
    }
}
