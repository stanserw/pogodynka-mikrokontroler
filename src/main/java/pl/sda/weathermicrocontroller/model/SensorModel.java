package pl.sda.weathermicrocontroller.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

/**
 * Tworzymy klasę modelową Sensora zawierającą pola:
 * String id - unikalny numer identyfikacyjny urządzenia,
 * String name - nazwa urzadzenia,
 * String description - do czego służy?,
 * Double latitude - równoleżnik (do określenia lokalizacji Sensora)
 * Double longitude - południk (do określenia lokalizacji Sensora)
 */

@Document
@Getter
@Setter
public class SensorModel {
    @Id
    private String id;
    private String name;
    private String description;
    private Double latitude;
    private Double longitude;

    public SensorModel(String id, String name, String description, Double latitude, Double longitude) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SensorModel)) return false;
        SensorModel that = (SensorModel) o;
        return getId().equals(that.getId()) &&
                getName().equals(that.getName()) &&
                getDescription().equals(that.getDescription()) &&
                getLatitude().equals(that.getLatitude()) &&
                getLongitude().equals(that.getLongitude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getLatitude(), getLongitude());
    }
}
