package pl.sda.weathermicrocontroller.dao;

import java.util.List;
import java.util.Objects;

/**
 * 1. tworzymy klasę Sensor, która zawiera pola:
 * "idSensor"- unikalny numer identyfikacyjny urządzenia,
 * "List<SensorData> sensorData" - lista zawierająca odczyty wartości,
 */
public class Sensor implements Sensorable {

    private String idSensor;
    private List<SensorData> sensorData;

    public Sensor() {
    }

    public Sensor(String idSensor, List<SensorData> sensorData) {
        this.idSensor = idSensor;
        this.sensorData = sensorData;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        this.idSensor = idSensor;
    }

    public List<SensorData> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<SensorData> sensorData) {
        this.sensorData = sensorData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sensor)) return false;
        Sensor sensor = (Sensor) o;
        return getIdSensor().equals(sensor.getIdSensor()) &&
                getSensorData().equals(sensor.getSensorData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSensor(), getSensorData());
    }

    @Override
    public void readOut() {

    }
}
