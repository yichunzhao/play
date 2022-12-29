package com.ynz.sandbox.play;

import org.apache.commons.lang3.StringUtils;

/**
 * A simple way to identify if a string is numeric.
 */
public class CheckStringNumeric {

    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "1f23";
        String num3 = "0123";

        isNumeric(num1);
        isNumeric(num2);
        isNumeric(num3);
    }

    private static void isNumeric(String numericString) {
        System.out.println(String.format("is %s numeric? %b", numericString, StringUtils.isNumeric(numericString)));
    }
}
