package com.ynz.sandbox.play;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashDemo {
    public static String hashString(String input) {

        try {
            // Create a MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Add the input bytes to the digest
            md.update(input.getBytes());

            // Compute the hash
            byte[] digest = md.digest();

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            // Return the hashed string
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 hashing algorithm not found", e);
        }
    }

    public static void main(String[] args) {
        String input = "With a team blog, you can invite multiple authors/contributors to your blog. This is best suited for devtools, engineering and open-source teams.";
        String hashedString = hashString(input);
        System.out.println("Original String: " + input);
        System.out.println("Hashed String: " + hashedString);
    }
}
