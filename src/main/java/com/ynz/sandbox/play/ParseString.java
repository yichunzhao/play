package com.ynz.sandbox.play;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseString {

    public static void parseString(String longString) {
        // Define a pattern to find keywords - adjust this regex to fit your needs
        Pattern pattern = Pattern.compile(".*word1.*word2.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(longString);

        // Find and print all matches
        while (matcher.find()) {
            System.out.println("Found the keyword '" + matcher.group(1) + "' at index " + matcher.start(1));
        }
    }

        public static void main(String[] args) {
            String longString = "This is a long string containing keyword1, some other text, and keyword2.";
            parseString(longString);
        }
}
