package com.example.examdatabase.service;

import com.example.examdatabase.entity.Supplier;
import com.example.examdatabase.payload.ResultMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class SupplierServiceImpl implements SupplierService {
    @Override
    public ResultMessage add(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier show(Integer id) {
        return null;
    }

    @Override
    public List<Supplier> showAll() {
        return null;
    }

    @Override
    public ResultMessage edit(Integer id, Supplier supplier) {
        return null;
    }

    @Override
    public ResultMessage delete(Integer id) {
        return null;
    }
}
