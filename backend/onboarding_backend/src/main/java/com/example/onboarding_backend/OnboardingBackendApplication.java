package com.example.onboarding_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.onboarding_backend.mapper")
public class OnboardingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnboardingBackendApplication.class, args);
    }

}
