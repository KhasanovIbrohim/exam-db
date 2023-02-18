package com.example.examdatabase.service;

import com.example.examdatabase.entity.Warehouse_UserId;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class WarehouseUserServiceImpl implements WarehouseUserService {
    @Override
    public ResultMessage add(Warehouse_UserId warehouseUserId) {
        return null;
    }

    @Override
    public Warehouse_UserId show(Integer id) {
        return null;
    }

    @Override
    public List<Warehouse_UserId> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Warehouse_UserId warehouseUserId) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
