package com.toy.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ToyProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToyProjectBoardApplication.class, args);
    }

}
