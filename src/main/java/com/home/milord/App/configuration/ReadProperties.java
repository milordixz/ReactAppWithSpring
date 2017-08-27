package com.home.milord.App.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource(value = "classpath:/app.properties")
public class ReadProperties{

    @Value("${test}")
    private String test;

    public String getTemp() {
        return test;
    }
}
