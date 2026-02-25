package utilities;

import java.util.UUID;

public class RandomUtils {

    // Generate random email
    public static String generateRandomEmail() {
        return "user_" + UUID.randomUUID().toString().substring(0,6) + "@gmail.com";
    }

    // Generate random mobile number
    public static String generateRandomNumber() {
        return UUID.randomUUID().toString().substring(0,10).replaceAll("[^0-9]", "9");
    }
}