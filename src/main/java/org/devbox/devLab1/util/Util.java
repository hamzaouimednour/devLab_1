package org.devbox.devLab1.util;

public class Util {

    private Util() {
        // Private constructor to prevent instantiation
    }

    public static String generateRandomString(int length) {
        // Generates a random alphanumeric string of the specified length
        // Implement your logic for generating a random string here
        // This is just a simple example
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }

    // Add other utility methods as needed
}
