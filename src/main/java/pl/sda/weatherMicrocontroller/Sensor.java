package pl.sda.weatherMicrocontroller;

import java.time.LocalDate;

public class Sensor implements Sensorable{

    private long id;
    private SensorData sensorData;
    private LocalDate localDate;
    private SensorType sensorType;

    @Override
    public void readOut() {

    }
}
