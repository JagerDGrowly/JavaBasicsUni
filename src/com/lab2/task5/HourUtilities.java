package com.lab2.task5;

import java.util.Arrays;

/**
 * Provides utility methods for working with Hour objects, including searching for words
 * and substrings in comments and managing arrays of Hour objects.
 */
public class HourUtilities {
    /**
     * Checks if a specific word is present in the comments of an Hour object.
     * The search is case-sensitive and considers whole words only.
     *
     * @param hour the Hour object to check
     * @param word the word to search for in the comments
     * @return true if the word is found as a whole word in the comments, false otherwise
     */
    public static boolean containsWord(Hour hour, String word) {
        String[] words = hour.getComments().split("\\s");
        Arrays.sort(words);
        return Arrays.binarySearch(words, word) >= 0;
    }

    /**
     * Checks if a specific substring is present in the comments of an Hour object.
     * The search is case-insensitive.
     *
     * @param hour      the Hour object to check
     * @param substring the substring to search for in the comments
     * @return true if the substring is found in the comments, false otherwise
     */
    public static boolean containsSubstring(Hour hour, String substring) {
        return hour.getComments().toUpperCase().contains(substring.toUpperCase());
    }

    /**
     * Adds a new Hour object to an existing array of Hour objects.
     * Creates a new array with increased size, copies the old elements, and adds the new item.
     *
     * @param arr  the original array of Hour objects (can be null)
     * @param item the Hour object to add
     * @return a new array containing all elements from the original array plus the new item
     */
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
