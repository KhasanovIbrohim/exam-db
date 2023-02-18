package com.example.examdatabase.service;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.entity.Warehouse_UserId;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface WarehouseUserService {
    ResultMessage add(Warehouse_UserId warehouseUserId);
    Warehouse_UserId show(Integer id);
    List<Warehouse_UserId> showAll();
    ResultMessage edit(Integer id,Warehouse_UserId warehouseUserId);
    ResultMessage delete(Integer id);
}
