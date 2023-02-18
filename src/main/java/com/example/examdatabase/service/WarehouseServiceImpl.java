package com.example.examdatabase.service;

import com.example.examdatabase.entity.Warehouse;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Override
    public ResultMessage add(Warehouse warehouse) {
        return null;
    }

    @Override
    public Warehouse show(Integer id) {
        return null;
    }

    @Override
    public List<Warehouse> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Warehouse warehouse) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
