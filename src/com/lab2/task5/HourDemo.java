package com.lab2.task5;

import static com.lab2.task5.HourUtilities.*;

public class HourDemo {
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

    public static void testHour(Hour hour) {
        hour.setNumberOfCustomers(200);
        hour.setComments("A lot of people in the Kiosk!");
        testWord(hour, "Kiosk!");
        testWord(hour, "Kiosk");
        testWord(hour, "Kiosn");
    }

    public static void main(String[] args) {
        testHour(new Hour());
    }
}
