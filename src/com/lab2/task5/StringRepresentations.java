package com.lab2.task5;

public class StringRepresentations {
    public static String toString(Hour hour) {
        return " - Kiosk at " + hour.getTime() + ". Amount of customers: " + hour.getNumberOfCustomers() +
                ". Comments: " + hour.getComments();
    }

    public static String toString(Kiosk kiosk) {
        StringBuilder result = new StringBuilder(kiosk.getName() + ". Address: " + kiosk.getAddress() + ".");
        for (int i = 0; i < kiosk.hoursCount(); i++) {
            result.append("\n").append(toString(kiosk.getHour(i)));
        }
        return result + "";
    }
}
