package com.etech.sprigintegrationapi.resttemplate.config;

import com.etech.sprigintegrationapi.resttemplate.exception.RestTemplateErrorHandler;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    private final RestTemplateErrorHandler restTemplateErrorHandler;


    public RestTemplateConfig(RestTemplateErrorHandler restTemplateErrorHandler) {
        this.restTemplateErrorHandler = restTemplateErrorHandler;
    }

    @Bean
    public RestTemplate restTemplate(){


        //return new RestTemplate();

        return new RestTemplateBuilder()
                .errorHandler(restTemplateErrorHandler)
                .build();
    }
}
