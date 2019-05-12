package pl.sda.weathermicrocontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WeatherMicrocontroller {

    public static void main(String[] args)
    {
        SpringApplication.run(WeatherMicrocontroller.class, args);
    }



}
