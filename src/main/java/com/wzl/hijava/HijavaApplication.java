package com.wzl.hijava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class HijavaApplication {

    public static void main(String[] args) {
        System.out.println("Hello Spring Boot");
        SpringApplication.run(HijavaApplication.class, args);
    }

}
