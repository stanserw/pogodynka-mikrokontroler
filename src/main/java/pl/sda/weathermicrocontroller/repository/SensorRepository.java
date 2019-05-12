package pl.sda.weathermicrocontroller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.sda.weathermicrocontroller.dao.Sensor;

@Repository
public interface SensorRepository extends MongoRepository<Sensor, String> {

    Sensor findBySensorName(String name);
}
