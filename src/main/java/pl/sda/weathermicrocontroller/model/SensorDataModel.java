package pl.sda.weathermicrocontroller.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Objects;

/**
 * tworzymy model SensorDataModel, zawierający dane:
 * String sensorId - identyfikator czujnika;
 * HashMap<String, Double> values - typ danych, wartość;
 * LocalDateTime date - data i czas odczytu danych;
 */

@Document
@Getter
@Setter
public class SensorDataModel {

    String sensorId;
    HashMap<String, Double> values;
    LocalDateTime date;

    public SensorDataModel() {
    }

    public SensorDataModel(String sensorId, HashMap<String, Double> values, LocalDateTime date) {
        this.sensorId = sensorId;
        this.values = values;
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SensorDataModel)) return false;
        SensorDataModel that = (SensorDataModel) o;
        return getSensorId().equals(that.getSensorId()) &&
                getValues().equals(that.getValues()) &&
                getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSensorId(), getValues(), getDate());
    }
}
