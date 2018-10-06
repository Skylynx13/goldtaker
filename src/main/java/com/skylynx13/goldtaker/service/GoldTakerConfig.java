package com.skylynx13.goldtaker.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoldTakerConfig {
    @Bean
    public Piggy piggy() {
        return new Piggy();
    }
}
