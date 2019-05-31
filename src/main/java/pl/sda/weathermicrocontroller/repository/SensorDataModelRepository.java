package pl.sda.weathermicrocontroller.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.sda.weathermicrocontroller.model.SensorDataModel;

@Repository
public interface SensorDataModelRepository extends MongoRepository<SensorDataModel, String> {
}
