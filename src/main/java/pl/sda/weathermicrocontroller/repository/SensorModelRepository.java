package pl.sda.weathermicrocontroller.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.sda.weathermicrocontroller.model.SensorModel;

import java.util.List;

@Repository
public interface SensorModelRepository extends CrudRepository<SensorModel, String> {

    List<SensorModel> findSensorModelByName (String name);

    @Query(value = "{'id': ?0}")
    List<SensorModel> find(@Param("id") String id);
}
