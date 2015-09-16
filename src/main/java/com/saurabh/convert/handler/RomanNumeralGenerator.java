package com.saurabh.convert.handler;

import org.springframework.stereotype.Component;

/**
 * Created by Saurabh on 15/09/2015.
 */
@Component
public interface RomanNumeralGenerator {

    String generate(int number); // convert from int -> roman
    int parse(String roman); // convert from roman -> int
}
