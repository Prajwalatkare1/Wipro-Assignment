package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {

    @Bean(name = "room1")
    public Dorm_Rooms___ room1() {
        return new Dorm_Rooms___(101, "A");
    }

    @Bean(name = "room2")
    public Dorm_Rooms___ room2() {
        return new Dorm_Rooms___(202, "B");
    }
}
