package pl.sda.weathermicrocontroller.controllers;


import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.weathermicrocontroller.model.SensorDataModel;
import pl.sda.weathermicrocontroller.repository.SensorDataModelRepository;

import java.util.List;

@RequestMapping(SensorMvcDataModelController.APP_SENSOR_PATH)
@Controller
public class SensorMvcDataModelController {

    static final String APP_SENSOR_PATH = "/app/sensor/data";
    private SensorDataModelRepository sensorDataModelRepository;

    public SensorMvcDataModelController(SensorDataModelRepository sensorDataModelRepository) {
        this.sensorDataModelRepository = sensorDataModelRepository;
    }

    @GetMapping("/list")
    public String allSensorsView(Model listViewModel) {

        // get sensors from db
        List<SensorDataModel> sensorDataList = sensorDataModelRepository.findAll(Sort.by("date").descending());

        // addSensorDataModel to the spring model
        listViewModel.addAttribute("allSensors", sensorDataList);

        return "list-sensors-readings";
    }

}
