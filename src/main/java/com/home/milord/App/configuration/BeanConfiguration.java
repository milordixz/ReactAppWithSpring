package com.home.milord.App.configuration;


import com.home.milord.App.beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public TestBean test(){
        return new TestBean();
    }


}
