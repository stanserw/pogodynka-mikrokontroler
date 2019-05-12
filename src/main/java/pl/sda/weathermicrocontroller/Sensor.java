package pl.sda.weathermicrocontroller;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 1. tworzymy klasę Sensor, która zawiera pola:
 * "id"- unikalny numer identyfikacyjny urządzenia,
 * "sensorName" - nazwa urzadzenia,
 * "description" - do czego służy?,
 * "List<SensorData> sensorData" - lista zawierająca odczyty wartości,
 * "LocalDateTime date" - data odczytu wartości
 */
public class Sensor implements Sensorable{

    private String id;
    private String sensorName;
    private String description;
    private List<SensorData> sensorData;
    private LocalDateTime date;

    public Sensor() {
    }

    public Sensor(String id, String name, String description, List<SensorData> sensorData, LocalDateTime date) {
        this.id = id;
        this.sensorName = name;
        this.description = description;
        this.sensorData = sensorData;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SensorData> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<SensorData> sensorData) {
        this.sensorData = sensorData;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public void readOut() {

    }
}
