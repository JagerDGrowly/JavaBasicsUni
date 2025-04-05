package com.lab2.task5;

import static com.lab2.task5.HourUtilities.*;

/**
 * Provides utility methods for analyzing Kiosk objects, including calculating average customer counts,
 * finding the hour with the minimum number of customers, and searching for specific words in comments.
 */
public class KioskUtilities {
    /**
     * Calculates the average number of customers across all hours of a Kiosk.
     *
     * @param kiosk the Kiosk object to analyze
     * @return the average number of customers as an integer
     * @throws ArithmeticException if the kiosk has no hours (division by zero)
     */
    public static int averageValueOfCustomers(Kiosk kiosk) {
        int average = 0;
        for (int i = 0; i < kiosk.hoursCount(); i++) {
            average += kiosk.getHour(i).getNumberOfCustomers();
        }
        return average / kiosk.hoursCount();
    }

    /**
     * Finds the time of the hour with the minimum number of customers in a Kiosk.
     *
     * @param kiosk the Kiosk object to analyze
     * @return the time of the hour with the minimum number of customers
     * @throws NullPointerException if the kiosk has no hours
     */
    public static String hourWithMinValueOfCustomers(Kiosk kiosk) {
        Hour hour = kiosk.getHour(0);
        for (int i = 1; i < kiosk.hoursCount(); i++) {
            if (hour.getNumberOfCustomers() > kiosk.getHour(i).getNumberOfCustomers()) {
                hour = kiosk.getHour(i);
            }
        }
        return hour.getTime();
    }

    /**
     * Finds all hours in a Kiosk where the comments contain a specific word.
     *
     * @param kiosk the Kiosk object to search
     * @param word  the word to search for in the comments
     * @return an array of Hour objects whose comments contain the specified word, or null if none are found
     */
    public static Hour[] findWord(Kiosk kiosk, String word) {
        Hour[] result = null;
        for(Hour hour : kiosk.getHours()) {
            if (containsWord(hour, word)) {
                result = addToArray(result, hour);
            }
        }
        return result;
    }
}
