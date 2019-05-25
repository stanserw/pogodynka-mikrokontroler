package pl.sda.weathermicrocontroller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sda.weathermicrocontroller.model.SensorModel;
import pl.sda.weathermicrocontroller.repository.SensorModelRepository;

@Controller
@RequestMapping(SensorModelController.API_SENSORS_PATH)
public class SensorModelController {

    static final String API_SENSORS_PATH = "/api/modelsensors";
    private SensorModelRepository sensorModelRepository;

    @Autowired
    public SensorModelController(SensorModelRepository sensorModelRepository) {
        this.sensorModelRepository = sensorModelRepository;
    }

    @GetMapping(value = "/add")
    public @ResponseBody
    String addNewSensor(@RequestParam String id, @RequestParam String name,
        @RequestParam String description, @RequestParam Double latitude, @RequestParam Double longitude) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        SensorModel s = new SensorModel();
        s.setId(id);
        s.setName(name);
        s.setDescription(description);
        s.setLatitude(latitude);
        s.setLongitude(longitude);
        sensorModelRepository.save(s);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<SensorModel> getAllModelSensors() {
        return sensorModelRepository.findAll();
    }

    @GetMapping("/get")
    public @ResponseBody
    Iterable<SensorModel> getAllModelSensorsByName(@RequestParam String name) {
        return sensorModelRepository.findSensorModelByName(name);
    }

    @GetMapping("/find")
    public @ResponseBody
    Iterable<SensorModel> getModelSensorById(@RequestParam String id) {
        // This returns a JSON or XML with the users
        return sensorModelRepository.find(id);
    }

}
