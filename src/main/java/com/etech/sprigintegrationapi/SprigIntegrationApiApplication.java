package com.etech.sprigintegrationapi;

import com.etech.sprigintegrationapi.resttemplate.exception.RestTemplateErrorHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableIntegration
public class SprigIntegrationApiApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SprigIntegrationApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
