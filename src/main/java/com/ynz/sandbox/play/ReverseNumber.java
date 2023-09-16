package com.ynz.sandbox.play;

/**
 * Reverse a number.
 *
 * Given a number 123 as input then return 321
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int given = 123;

        System.out.println("reversed: " + reverse(given));
    }

    public static int reverse(int num) {
        String numInString = String.valueOf(num);
        StringBuilder sb = new StringBuilder(numInString);
        String reversedString = sb.reverse().toString();
        return Integer.parseInt(reversedString);
    }
}
