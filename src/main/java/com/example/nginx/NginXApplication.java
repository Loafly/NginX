package com.example.nginx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NginXApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/NginX/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(NginXApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
