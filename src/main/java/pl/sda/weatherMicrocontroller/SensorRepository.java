package pl.sda.weatherMicrocontroller;

import org.springframework.data.repository.CrudRepository;

public interface SensorRepository extends CrudRepository<Sensor, String> {
}
