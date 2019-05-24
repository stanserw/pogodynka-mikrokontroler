package pl.sda.weathermicrocontroller.model;

import java.util.Objects;

/**
 * Tworzymy klasę SensorData -
 */
public class SensorData {

    private String name;
    private Double value;

    public SensorData() {
    }

    public SensorData(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SensorData)) return false;
        SensorData that = (SensorData) o;
        return getName().equals(that.getName()) &&
                getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getValue());
    }
}
