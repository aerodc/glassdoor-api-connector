package com.dcliu.glassdoorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class GlassDoorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlassDoorApiApplication.class, args);
    }
}
