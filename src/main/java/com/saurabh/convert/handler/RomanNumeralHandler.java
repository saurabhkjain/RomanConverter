package com.saurabh.convert.handler;

import org.springframework.stereotype.Component;

/**
 * Created by Saurabh on 15/09/2015.
 */
@Component
public class RomanNumeralHandler implements  RomanNumeralGenerator{
    public int decodeRomanLetter(char letter) {
        switch(letter) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0;
        }
    }

    public String generate(int number) {
        if(number < 1 || number > 3999){
            throw new IllegalArgumentException("The number which you have inputted is either less than 1 or greater than 3999.");
        }

        int[] aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String roman = "";

        for(int i=0; i<aArray.length; i++){
            while(number >= aArray[i]){
                roman += rArray[i];
                number -= aArray[i];
            }
        }
        return roman;
    }

    private boolean validString(String romanNumeral) {
        return romanNumeral.matches("\\d*");
    }

    public int parse(String roman) {
        if(!validString(roman)) {
            int result = 0;
            for (int i = 0; i < roman.length() - 1; i++) {
                if (decodeRomanLetter(roman.charAt(i)) < decodeRomanLetter(roman.charAt(i + 1))) {
                    //subtract it
                    result -= decodeRomanLetter(roman.charAt(i));
                } else {
                    //add it
                    result += decodeRomanLetter(roman.charAt(i));
                }
            }
            result += decodeRomanLetter(roman.charAt(roman.length() - 1));
            return result;
        }
        else {
            throw new IllegalArgumentException("It seems you have typed in a number. Please try again!");
        }
    }
}
