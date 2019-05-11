package pl.sda.pogodynkamikrokontroler;

import java.time.LocalDate;

public class Sensor implements Sensorable{

    private long id;
    private double temperature;
    private double humidity;
    private LocalDate localDate;
    private SensorType sensorType;

    @Override
    public void readOut() {

    }
}
