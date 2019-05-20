package pl.sda.weathermicrocontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.weathermicrocontroller.model.SensorDataModel;
import pl.sda.weathermicrocontroller.repository.SensorDataModelRepository;

import java.time.LocalDateTime;

@RestController
@RequestMapping(SensorDataModelController.API_SENSORDATA_PATH)
public class SensorDataModelController {

    static final String API_SENSORDATA_PATH = "/api/sensor/data";
    private SensorDataModelRepository sensorDataModelRepository;

    @Autowired
    public SensorDataModelController(SensorDataModelRepository sensorDataModelRepository) {
        this.sensorDataModelRepository = sensorDataModelRepository;
    }

    @PostMapping
    public void add(@RequestBody SensorDataModel sensorDataModel) {
        sensorDataModel.setDate(LocalDateTime.now());
        sensorDataModelRepository.save(sensorDataModel);
    }

    @GetMapping("/all")
    public Iterable<SensorDataModel> getAllSensorsDataModel() {
        return sensorDataModelRepository.findAll();
    }

}
