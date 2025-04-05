package com.lab2.task5;

import java.util.Arrays;

public class HourUtilities {
    public static boolean containsWord(Hour hour, String word) {
        String[] words = hour.getComments().split("\\s");
        Arrays.sort(words);
        return Arrays.binarySearch(words, word) >= 0;
    }

    public static boolean containsSubstring(Hour hour, String substring) {
        return hour.getComments().toUpperCase().contains(substring.toUpperCase());
    }

    public static Hour[] addToArray(Hour[] arr, Hour item) {
        Hour[] newArr;

        if (arr != null) {
            newArr = new Hour[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
        }
        else {
            newArr = new Hour[1];
        }

        newArr[newArr.length - 1] = item;
        return newArr;
    }
}
