package pl.sda.weathermicrocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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
    public String getAllSensors(Model model) {
        //return sensorRepository.findAll();
//        List<Sensor> sensorList = new ArrayList<>();
//        sensorList = sensorRepository.findAll();

        // add to the Spring MVC model
        model.addAttribute("sensors", sensorRepository.findAll());

        return "list-sensors";
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
