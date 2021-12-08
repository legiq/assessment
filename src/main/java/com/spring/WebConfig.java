package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public SomeBean someBean() {
        return new SomeBean();
    }
}
