package com.lab2.task5;

/**
 * Provides utility methods for creating string representations of Hour and Kiosk objects.
 * These representations are used for formatted output to the console.
 */
public class StringRepresentations {
    /**
     * Creates a string representation of an Hour object.
     *
     * @param hour the Hour object to represent
     * @return a string in the format " - Kiosk at [time]. Amount of customers: [number]. Comments: [comments]"
     */
    public static String toString(Hour hour) {
        return " - Kiosk at " + hour.getTime() + ". Amount of customers: " + hour.getNumberOfCustomers() +
                ". Comments: " + hour.getComments();
    }

    /**
     * Creates a string representation of a Kiosk object, including its name, address, and all hours.
     *
     * @param kiosk the Kiosk object to represent
     * @return a string containing the kiosk's name, address, and a list of all hours
     */
    public static String toString(Kiosk kiosk) {
        StringBuilder result = new StringBuilder(kiosk.getName() + ". Address: " + kiosk.getAddress() + ".");
        for (int i = 0; i < kiosk.hoursCount(); i++) {
            result.append("\n").append(toString(kiosk.getHour(i)));
        }
        return result + "";
    }
}
