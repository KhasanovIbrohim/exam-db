package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Supplier;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.SupplierServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class SupplierControllerImpl implements SupplierController{
    final SupplierServiceImpl supplierService;
    @Override
    public ResultMessage addSupplier(Supplier supplier) {
        return null;
    }

    @Override
    public ResultMessage editSupplier(Integer id, Supplier supplier) {
        return null;
    }

    @Override
    public ResultMessage deleteSupplier(Integer id) {
        return null;
    }

    @Override
    public Supplier showSupplier(Integer id) {
        return null;
    }

    @Override
    public List<Supplier> showSuppliers() {
        return null;
    }
}
