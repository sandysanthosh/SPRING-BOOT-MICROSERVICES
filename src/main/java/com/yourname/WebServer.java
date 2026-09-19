package com.yourname;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Shared HTTP client configuration for the standalone Spring Boot sample.
 *
 * The application entry point is Main.java. Add service discovery and
 * microservice clients in complete modules with their dependencies.
 */
@Configuration
class WebServerConfiguration {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
