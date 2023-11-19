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

    /**
     * Check if a given string is empty or null.
     *
     * @param str Input string
     * @return True if the string is empty or null, false otherwise
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Validate if a given email address is valid.
     *
     * @param email Email address to validate
     * @return True if the email is valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) {
            return false;
        }

        // Simple email validation logic
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }

    // Add other utility methods as needed
}
