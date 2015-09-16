package com.saurabh.convert.handler;

import com.saurabh.convert.config.GlobalConfiguration;
import com.saurabh.convert.config.RomanNumeralHandlerConfig;
import com.saurabh.convert.configuration.TestWebConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

import javax.inject.Inject;

import static org.mockito.Mockito.when;

/**
 * Created by saurabh.jain on 16/09/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RomanNumeralHandlerConfig.class})
public class RomanNumeralHandlerTest {

    @Inject
    private RomanNumeralHandler romanNumeralHandler;

    @Test
     public void testParseReturnsOneThousandWhenRomanCharMIsPassed() throws Exception {
        int actual = romanNumeralHandler.decodeRomanLetter('M');
        assertEquals(1000, actual);
    }

    @Test
    public void testParseReturnsTenWhenRomanCharXIsPassed() throws Exception {
        int actual = romanNumeralHandler.decodeRomanLetter('X');
        assertEquals(10, actual);
    }

    @Test
    public void testParseReturnsZeroWhenRomanCharPIsPassed() throws Exception {
      int actual = romanNumeralHandler.decodeRomanLetter('P');
        assertEquals(0, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGenerateThrowsIllegalArgumentExceptionWhenZeroIsPassedIn() {
        romanNumeralHandler.generate(0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGenerateThrowsIllegalArgumentExceptionWhenFourThousandIsPassedIn() {
        romanNumeralHandler.generate(4000);
    }
}
