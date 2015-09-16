package com.saurabh.convert.controller;

import com.saurabh.convert.handler.RomanNumeralHandler;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * Created by Saurabh on 15/09/2015.
 */
@RestController
@RequestMapping(value = "/convert")
public class RomanConverterController {

    @Inject private RomanNumeralHandler romanNumeralHandler;

    @RequestMapping(value = "/toNumeral/{roman}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public int toInteger(@PathVariable("roman") String romanNumeral) {
        return romanNumeralHandler.parse(romanNumeral);
    }

    @RequestMapping(value = "/toRoman/{number}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String toRoman(@PathVariable("number") int number) {
        return romanNumeralHandler.generate(number);
    }
}
