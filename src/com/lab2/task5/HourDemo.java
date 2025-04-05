package com.lab2.task5;

import static com.lab2.task5.HourUtilities.*;

/**
 * A demo class to test the functionality of the Hour class and HourUtilities methods.
 * It creates an Hour object, sets its properties, and tests the presence of specific words
 * and substrings in the comments.
 */
public class HourDemo {
    /**
     * Tests whether a given word or substring is present in the comments of an Hour object.
     * Prints the results of both word and substring searches to the console.
     *
     * @param hour the Hour object to test
     * @param word the word or substring to search for in the comments
     */
    private static void testWord(Hour hour, String word) {
        if (containsWord(hour, word)) {
            System.out.println("Word \"" + word + "\" contains in the comment");
        }
        else {
            System.out.println("Word \"" + word + "\" doesn't contain in the comment");
        }
        if (containsSubstring(hour, word)) {
            System.out.println("Text \"" + word + "\" contains in the comment");
        }
        else {
            System.out.println("Text \"" + word + "\" doesn't contain in the substring");
        }
    }

    /**
     * Tests the functionality of an Hour object by setting its properties and
     * performing word and substring searches on its comments.
     *
     * @param hour the Hour object to test
     */
    public static void testHour(Hour hour) {
        hour.setTime("1 p.m.");
        hour.setNumberOfCustomers(200);
        hour.setComments("A lot of people in the Kiosk!");
        testWord(hour, "Kiosk!");
        testWord(hour, "Kiosk");
        testWord(hour, "Kiosn");
    }

    /**
     * The main method that initiates the testing of an Hour object.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        testHour(new Hour());
    }
}
