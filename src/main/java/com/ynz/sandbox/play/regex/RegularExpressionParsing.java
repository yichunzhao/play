package com.ynz.sandbox.play.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionParsing {
    public static void main(String[] args) {
        // Define your input string
        String inputString = "This is a string containing word1 and keyword4 txt";

        // Define the regular expression pattern
        String pattern = ".*(word1|word2).*(word2|word4).*";

        // Create a Pattern object
        Pattern regexPattern = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regexPattern.matcher(inputString);

        // Check if a match is found
        if (matcher.find()) {
            // Extract the matched value within the parentheses
            String extractedValue = matcher.group(0);
            String extractedValue1 = matcher.group(1);
            String extractedValue2 = matcher.group(2);
            System.out.println("Match found: " + extractedValue);
            System.out.println("Match found: " + extractedValue1);
            System.out.println("Match found: " + extractedValue2);

        } else {
            System.out.println("No match found.");
        }
    }
}
