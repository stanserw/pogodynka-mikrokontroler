package pl.sda.weathermicrocontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.weathermicrocontroller.dao.Sensor;
import pl.sda.weathermicrocontroller.repository.SensorRepository;

import java.util.Optional;

@RestController
@RequestMapping(SensorController.API_SENSOR_PATH)
public class SensorController {

    static final String API_SENSOR_PATH = "/api/sensor";
    private SensorRepository sensorRepository;

    // Tworzymy konstruktor
    @Autowired
    public SensorController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    /**
     * Tworzymy metode do zapisywania
     */
    @PostMapping
    public void Sensor(@RequestBody Sensor sensor) {
        sensorRepository.save(sensor);
    }

    @GetMapping("/all")
    public Iterable<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> getOneSensor(@PathVariable String id) {
        return sensorRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOneSensor(@PathVariable String id) {
        sensorRepository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllSensors() {
        sensorRepository.deleteAll();
    }

}
