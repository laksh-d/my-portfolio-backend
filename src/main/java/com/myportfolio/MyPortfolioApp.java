package com.myportfolio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "MyPortfolioApp",
                version = "1.0",
                description = "REST APIs project for personalized portfolio"
        )
)
@SpringBootApplication
public class MyPortfolioApp {

    public static void main(String[] args) {
        SpringApplication.run(MyPortfolioApp.class, args);
    }

}
