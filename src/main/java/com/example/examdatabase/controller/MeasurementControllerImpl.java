package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Measurement;
import com.example.examdatabase.payload.ResultMessage;
import com.example.examdatabase.service.MeasurementServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class MeasurementControllerImpl implements MeasurementController{
    final MeasurementServiceImpl measurementService;
    @Override
    public ResultMessage addMeasurement(Measurement measurement) {
        return null;
    }

    @Override
    public ResultMessage editMeasurement(Integer id, Measurement measurement) {
        return null;
    }

    @Override
    public ResultMessage deleteMeasurement(Integer id) {
        return null;
    }

    @Override
    public Measurement showMeasurement(Integer id) {
        return null;
    }

    @Override
    public List<Measurement> showMeasurements() {
        return null;
    }
}
