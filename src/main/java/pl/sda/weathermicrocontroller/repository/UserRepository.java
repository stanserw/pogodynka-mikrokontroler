package pl.sda.weathermicrocontroller.repository;

import pl.sda.weathermicrocontroller.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface UserRepository extends CrudRepository<User, ObjectId> {


    List<User> findUserByName(String name);

    Stream<User> readAllByNameNotNull();

    //@Query(value = "{'messageType': ?0}", fields = "{'sender': 1}")
    @Query(value = "{'name': ?0}")
    List<User> find(@Param("name") String lastName);

}
