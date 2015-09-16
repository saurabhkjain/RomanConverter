package com.saurabh.convert.controller;

import com.saurabh.convert.config.GlobalConfiguration;
import com.saurabh.convert.configuration.TestWebConfiguration;
import com.saurabh.convert.handler.RomanNumeralHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Saurabh on 15/09/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestWebConfiguration.class, GlobalConfiguration.class})
@WebAppConfiguration
public class RomanConverterControllerTest {
    @Inject
    private WebApplicationContext webApplicationContext;
    @Inject private RomanNumeralHandler romanNumeralHandler;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    @Test
     public void testToInteger() throws Exception{
        mockMvc.perform(get("/convert/toNumeral/MMM")).andExpect(status().isOk());
    }

    @Test
    public void testToIntegerIsBadRequest() throws Exception{
        mockMvc.perform(post("/convert/toNumeral/45")).andExpect(status().isMethodNotAllowed());
    }

    @Test
    public void testToRomanIsBadRequest() throws Exception{
        mockMvc.perform(get("/convert/toRoman/MMM")).andExpect(status().isBadRequest());
    }

    @Test
    public void testToRomanIsOk() throws Exception{
        mockMvc.perform(get("/convert/toRoman/123")).andExpect(status().isOk());
    }

    @Test
    public void testToRomanIsNotFound() throws Exception{
        mockMvc.perform(get("/convert/toRoman/")).andExpect(status().isNotFound());
    }
}
