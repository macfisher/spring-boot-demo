package com.sorclab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("application.properties")
@EntityScan(basePackages = {"com.sorclab.domain"})
public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    // PostRepository

    // DataLoader

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication
                                    .run(App.class, args);

        System.out.println("Sorc Lab Spring Boot App");


    }
}
