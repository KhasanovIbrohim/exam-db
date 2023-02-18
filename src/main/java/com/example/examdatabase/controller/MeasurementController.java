package com.example.examdatabase.controller;

import com.example.examdatabase.entity.Measurement;
import com.example.examdatabase.payload.ResultMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/measurement")
public interface MeasurementController {
    @PostMapping("/add")
    ResultMessage addMeasurement(@RequestBody Measurement measurement);
    @PutMapping("/edit/{id}")
    ResultMessage editMeasurement(@PathVariable Integer id, @RequestBody Measurement measurement);
    @DeleteMapping("/delete/{id}")
    ResultMessage deleteMeasurement(@PathVariable Integer id);
    @GetMapping("/show/{id}")
    Measurement showMeasurement(@PathVariable Integer id);
    @GetMapping("/showAll/")
    List<Measurement> showMeasurements();
}
