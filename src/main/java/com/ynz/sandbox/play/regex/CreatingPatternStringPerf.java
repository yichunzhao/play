package com.ynz.sandbox.play.regex;

import java.time.Instant;

/**
 * creating a 1_000 pattern strings and compile them into pattern objects, and measure the time.
 * It costs around 18 ms.
 */
public class CreatingPatternStringPerf {

    public static void main(String[] args) {
        // print out a patter string
        var demo = createPatternGivenKeywords(new String[]{"word1", "word2", "word3", "word4"});
        System.out.println(demo);

        // Create pattern 10_000 times and test the performance
        var start = Instant.now();
        for (int i = 0; i < 1_000; i++) {
            createPatternGivenKeywords(new String[]{"word1", "word2", "word3", "word4"});
        }
        var end = Instant.now();

        System.out.println("Time: " + (end.toEpochMilli() - start.toEpochMilli()) + " ms");
    }

    private static String createPatternGivenKeywords(String[] keywords) {
        StringBuilder pattern = new StringBuilder(".*");
        for (int i = 0; i < keywords.length; i++) {
            pattern.append(keywords[i]);
            if (i < keywords.length - 1) {
                pattern.append(".*");
            }
        }
        pattern.append(".*");

        return pattern.toString();
    }
}
