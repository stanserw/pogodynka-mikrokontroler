package pl.sda.weathermicrocontroller.model;

/**
 * Tworzymy klasę modelową Sensora zawierającą pola:
 * String id - unikalny numer identyfikacyjny urządzenia,
 * String name - nazwa urzadzenia,
 * String description - do czego służy?,
 * Double latitude - równoleżnik (do określenia lokalizacji Sensora)
 * Double longitude - południk (do określenia lokalizacji Sensora)
 */
public class SensorModel {
    private String id;
    private String name;
    private String description;
    private Double latitude;
    private Double longitude;
}
