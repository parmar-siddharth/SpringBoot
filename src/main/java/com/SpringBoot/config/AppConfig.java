package com.SpringBoot.config;

import com.SpringBoot.repository.JavaSpringBoot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public JavaSpringBoot javaSpringBoot(){
        return new JavaSpringBoot();
    }
}
