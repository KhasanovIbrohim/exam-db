package com.example.examdatabase.service;
import com.example.examdatabase.entity.Measurement;
import com.example.examdatabase.payload.ResultMessage;

import java.util.List;

public interface MeasurementService {
    ResultMessage add(Measurement measurement);
    Measurement show(Integer id);
    List<Measurement> showAll();
    ResultMessage edit(Integer id,Measurement measurement);
    ResultMessage delete(Integer id);
}
