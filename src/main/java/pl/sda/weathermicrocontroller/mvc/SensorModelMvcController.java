package pl.sda.weathermicrocontroller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.weathermicrocontroller.model.SensorModel;
import pl.sda.weathermicrocontroller.model.User;
import pl.sda.weathermicrocontroller.repository.SensorModelRepository;
import pl.sda.weathermicrocontroller.repository.UserRepository;

import java.util.List;

@RequestMapping(SensorModelMvcController.APP_SENSORMODEL_PATH)
@Controller
public class SensorModelMvcController {

    static final String APP_SENSORMODEL_PATH = "/app/sensormodel";
    private SensorModelRepository sensorModelRepository;

    public SensorModelMvcController(SensorModelRepository sensorModelRepository) {
        this.sensorModelRepository = sensorModelRepository;
    }

    @GetMapping
    public String getAllSensorModelsView(Model listViewModel) {

        // get sensors models from db
        List<SensorModel> sensorModels = (List<SensorModel>) sensorModelRepository.findAll();

        // add sensor model to the spring model
        listViewModel.addAttribute("sensormodels", sensorModels);

        return "sensormodel-list";
    }
}
