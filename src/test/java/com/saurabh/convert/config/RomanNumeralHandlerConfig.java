package com.saurabh.convert.config;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by saurabh.jain on 16/09/2015.
 */
@Configuration
public class RomanNumeralHandlerConfig {
    @Bean
    public com.saurabh.convert.handler.RomanNumeralHandler romanNumeralHandler() {
        return Mockito.spy(com.saurabh.convert.handler.RomanNumeralHandler.class);
    }
}
