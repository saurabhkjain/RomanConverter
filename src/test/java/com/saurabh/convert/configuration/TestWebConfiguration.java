package com.saurabh.convert.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by saurabh.jain on 16/09/2015.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.saurabh.convert.controller"})
public class TestWebConfiguration extends WebMvcConfigurerAdapter {

}
