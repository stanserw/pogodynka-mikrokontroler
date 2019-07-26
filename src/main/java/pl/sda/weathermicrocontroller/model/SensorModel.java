package pl.sda.weathermicrocontroller.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


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

}
