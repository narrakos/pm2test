package com.spring.pm2test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Pm2testApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pm2testApplication.class, args);
    }

}
