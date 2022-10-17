package com.sparta.w2homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class W2homeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(W2homeworkApplication.class, args);
    }

}
