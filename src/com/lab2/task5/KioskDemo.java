package com.lab2.task5;

import static com.lab2.task5.KioskUtilities.*;

public class KioskDemo {
    public static Kiosk createKiosk() {
        Kiosk kiosk = new Kiosk();
        kiosk.setName("Quick Snacks");
        kiosk.setAddress("Peremoga str. 1");

        kiosk.addHour("8 a.m.", 3, "Small amount of people.");
        kiosk.addHour("12 p.m.", 12, "That's a lot of people for a kiosk.");
        kiosk.addHour("3 p.m.", 5, "Average load.");
        kiosk.addHour("6 p.m.", 20, "Rush hour. The queue in front of the" +
                " entrance to the kiosk.");
        kiosk.addHour("9 p.m.", 7, "Average load.");
        kiosk.addHour("12 a.m.", 2, "Small amount of people.");
        kiosk.addHour("3 a.m.", 1, "Only one person.");

        return kiosk;
    }

    public static void printWord(Kiosk kiosk, String word) {
        Hour[] result = findWord(kiosk, word);
        if (result == null) {
            System.out.println("There is no such a word like \"" + word + "\"");
        }
        else {
            System.out.println("Found a word \"" + word + "\"" + " in:");
            for (Hour hour : result) {
                System.out.println(StringRepresentations.toString(hour));
            }
        }
    }

    public static void testKiosk(Kiosk kiosk) {
        System.out.println("Average amount of customers: " + averageValueOfCustomers(kiosk));
        System.out.println("Hour with a minimum amount of customers: " +
                hourWithMinValueOfCustomers(kiosk));
        printWord(kiosk, "amount");
        printWord(kiosk, "Rush");
        printWord(kiosk, "Nobody");

        Hour newHour = new Hour();
        newHour.setTime("12 a.m.");
        newHour.setNumberOfCustomers(0);
        newHour.setComments("Nobody here.");
        kiosk.setHour(kiosk.hoursCount() - 2, newHour);
        System.out.println("(Number of customers at 12 a.m. has been changed to 0)");

        System.out.println("Average amount of customers: " + averageValueOfCustomers(kiosk));
        System.out.println("Hour with a minimum amount of customers: " +
                hourWithMinValueOfCustomers(kiosk));
        printWord(kiosk, "amount");
        printWord(kiosk, "Rush");
        printWord(kiosk, "Nobody");

        kiosk.clearHours();
    }

    public static void main(String[] args) {
        testKiosk(createKiosk());
    }
}
