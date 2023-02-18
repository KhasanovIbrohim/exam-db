package com.example.examdatabase.service;

import com.example.examdatabase.entity.Attachment;
import com.example.examdatabase.entity.Warehouse;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface WarehouseService {
    ResultMessage add(Warehouse warehouse);
    Warehouse show(Integer id);
    List<Warehouse> showAll();
    ResultMessage edit(Integer id,Warehouse warehouse);
    ResultMessage delete(Integer id);
}
