package pl.sda.weathermicrocontroller.dao;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 1. tworzymy klasę Sensor, która zawiera pola:
 * "id"- unikalny numer identyfikacyjny urządzenia,
 * "List<SensorData> sensorData" - lista zawierająca odczyty wartości,
 */
public class Sensor implements Sensorable {

    @Id
    private String id;
    private List<SensorData> sensorData;

    public Sensor() {
    }

    public Sensor(String id, List<SensorData> sensorData) {
        this.id = id;
        this.sensorData = sensorData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return getId().equals(sensor.getId()) &&
                getSensorData().equals(sensor.getSensorData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSensorData());
    }

    @Override
    public void readOut() {

    }
}
