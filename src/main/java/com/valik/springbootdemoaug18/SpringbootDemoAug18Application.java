package com.valik.springbootdemoaug18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringbootDemoAug18Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoAug18Application.class, args);
    }
}
