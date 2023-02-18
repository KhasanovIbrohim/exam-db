package com.example.examdatabase.service;
import com.example.examdatabase.entity.Supplier;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface SupplierService {
    ResultMessage add(Supplier supplier);
    Supplier show(Integer id);
    List<Supplier> showAll();
    ResultMessage edit(Integer id,Supplier supplier);
    ResultMessage delete(Integer id);
}
