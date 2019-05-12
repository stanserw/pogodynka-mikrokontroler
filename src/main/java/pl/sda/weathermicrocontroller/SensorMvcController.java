package pl.sda.weathermicrocontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(SensorMvcController.APP_SENSOR_PATH)
@Controller
public class SensorMvcController {

    static final String APP_SENSOR_PATH = "/app/sensors";
    private SensorRepository sensorRepository;

    public SensorMvcController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping
    public String allSensorsView(Model listViewModel) {
        listViewModel.addAttribute("allSensors", sensorRepository.findAll());
        return "list-sensors";
    }
}
