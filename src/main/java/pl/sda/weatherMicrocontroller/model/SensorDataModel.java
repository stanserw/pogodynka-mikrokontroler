package pl.sda.weatherMicrocontroller.model;

import java.time.LocalDateTime;
import java.util.HashMap;

public class SensorDataModel {
    String sensorId;
    HashMap<String, Double> values;
    LocalDateTime date;
}
