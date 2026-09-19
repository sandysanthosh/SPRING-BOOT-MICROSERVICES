package com.yourname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Minimal, runnable Spring Boot application entry point.
 *
 * Add service discovery and inter-service clients in a complete
 * microservices module with its required dependencies and configuration.
 */
@SpringBootApplication
public class WebServer {

    public static void main(String[] args) {
        SpringApplication.run(WebServer.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
