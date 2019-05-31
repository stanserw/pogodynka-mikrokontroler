package pl.sda.weathermicrocontroller.mvc;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.weathermicrocontroller.model.SensorDataModel;
import pl.sda.weathermicrocontroller.repository.SensorDataModelRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping(SensorDataModelMvcController.APP_SENSOR_PATH)
@Controller
public class SensorDataModelMvcController {

    static final String APP_SENSOR_PATH = "/app/sensor/data";
    private SensorDataModelRepository sensorDataModelRepository;

    public SensorDataModelMvcController(SensorDataModelRepository sensorDataModelRepository) {
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

    @GetMapping("/pagelist")
    public String allSensorsPageView(HttpServletRequest request, Model model) {

        int page = 0; //default page number is 0 (yes it is weird)
        int size = 10; //default page size is 10

        if (request.getParameter("page") != null && !request.getParameter("page").isEmpty()) {
            page = Integer.parseInt(request.getParameter("page")) - 1;
        }

        if (request.getParameter("size") != null && !request.getParameter("size").isEmpty()) {
            size = Integer.parseInt(request.getParameter("size"));
        }

        model.addAttribute("allSensors", sensorDataModelRepository.findAll(PageRequest.of(page, size,
                Sort.by("date").descending())));

        return "list-sensors-readings-page-ten-links";
    }

}
