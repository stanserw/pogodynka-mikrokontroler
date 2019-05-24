package pl.sda.weathermicrocontroller.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 1. tworzymy klasę Sensor, która zawiera pola:
 * "idSensor"- unikalny numer identyfikacyjny urządzenia,
 * "List<SensorData> sensorData" - lista zawierająca odczyty wartości,
 */

@Document
@Getter
@Setter
public class Sensor {

    @Id
    private String idSensor;
    private List<SensorData> sensorData;
    private LocalDateTime date;

    public Sensor() {
    }

    public Sensor(String idSensor, List<SensorData> sensorData, LocalDateTime date) {
        this.idSensor = idSensor;
        this.sensorData = sensorData;
        this.date = date;
    }

    public Sensor(String idSensor, List<SensorData> sensorData) {
        this.idSensor = idSensor;
        this.sensorData = sensorData;
    }

}
