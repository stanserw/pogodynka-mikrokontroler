package pl.sda.weathermicrocontroller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "weather");
    }

    @Bean
    public MongoClient mongo() {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://user-sts_01:Stan5566sts@cluster0-g6qzz.mongodb.net/test?retryWrites=true");
        return new MongoClient(uri);
    }
}

