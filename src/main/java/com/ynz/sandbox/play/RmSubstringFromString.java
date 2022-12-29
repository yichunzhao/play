package com.ynz.sandbox.play;

public class RmSubstringFromString {

    public static void main(String[] args) {
        String baseUri = "http://localhost:2389";
        String uri = String.format("%s/appointments", baseUri);
        System.out.println(uri);
        System.out.println(String.format("contains baseUri %b", uri.contains(baseUri)));
        System.out.println(uri.replaceFirst(baseUri, ""));
    }
}
