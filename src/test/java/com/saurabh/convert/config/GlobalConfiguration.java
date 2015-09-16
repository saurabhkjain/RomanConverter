package com.saurabh.convert.config;

import com.saurabh.convert.handler.RomanNumeralHandler;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by saurabh.jain on 16/09/2015.
 */
@Configuration
public class GlobalConfiguration {

    @Bean
    public RomanNumeralHandler romanNumeralHandler() {
        return Mockito.mock(RomanNumeralHandler.class);
    }


}
