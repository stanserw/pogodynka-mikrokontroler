package pl.sda.weatherMicrocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
