package com.pofree.pofree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PofreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PofreeApplication.class, args);
    }
}
