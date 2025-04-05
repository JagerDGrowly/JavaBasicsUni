package com.lab2.task5;

import static com.lab2.task5.HourUtilities.*;

public class KioskUtilities {
    public static int averageValueOfCustomers(Kiosk kiosk) {
        int average = 0;
        for (int i = 0; i < kiosk.hoursCount(); i++) {
            average += kiosk.getHour(i).getNumberOfCustomers();
        }
        return average / kiosk.hoursCount();
    }

    public static String hourWithMinValueOfCustomers(Kiosk kiosk) {
        Hour hour = kiosk.getHour(0);
        for (int i = 1; i < kiosk.hoursCount(); i++) {
            if (hour.getNumberOfCustomers() > kiosk.getHour(i).getNumberOfCustomers()) {
                hour = kiosk.getHour(i);
            }
        }
        return hour.getTime();
    }

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
