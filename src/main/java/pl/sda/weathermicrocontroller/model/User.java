package pl.sda.weathermicrocontroller.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
public class User {

    @Id
    private ObjectId id;
    private String name;
    private String email;


}
