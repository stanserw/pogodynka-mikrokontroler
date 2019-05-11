package pl.sda.weatherMicrocontroller.model;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * tworzymy model SensorDataModel, zawierający dane:
 * String sensorId - identyfikator czujnika;
 * HashMap<String, Double> values - typ danych, wartość;
 * LocalDateTime date - data i czas odczytu danych;
 */
public class SensorDataModel {
    String sensorId;
    HashMap<String, Double> values;
    LocalDateTime date;
}
