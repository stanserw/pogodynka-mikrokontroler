package pl.sda.weathermicrocontroller.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.weathermicrocontroller.dao.Sensor;
import pl.sda.weathermicrocontroller.repository.SensorRepository;

import java.util.List;

@RequestMapping(SensorMvcController.APP_SENSOR_PATH)
@Controller
public class SensorMvcController {

    static final String APP_SENSOR_PATH = "/app/sensor";
    private SensorRepository sensorRepository;

    public SensorMvcController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping("/list")
    public String allSensorsView(Model listViewModel) {

        // get sensors from db
        List<Sensor> sensorList = sensorRepository.findAll();

        // add to the spring model
        listViewModel.addAttribute("allSensors", sensorList);

        return "list-sensors";
    }
}
