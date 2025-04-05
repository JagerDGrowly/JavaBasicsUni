package com.lab2.task4;

import java.util.*;

/**
 * A class that evenly distributes spaces between words in a given string to match a specified length.
 * The program takes a string as a command-line argument and a desired length as user input, then
 * adjusts the spaces between words to achieve the target length while preserving the words themselves.
 */
public class Main {
    /**
     * The main method that processes a string from command-line arguments, adjusts the spacing
     * between words to match a user-specified length, and prints the resulting string.
     * The number of spaces is distributed as evenly as possible between words, with any remaining
     * spaces added to the first few gaps.
     *
     * @param args command-line arguments, where args[0] is the input string containing words separated by spaces
     */
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        String[] line = args[0].split(" ");

        int totalWordLength = 0;
        for (String word : line) {
            totalWordLength += word.length();
        }

        int interval = n - totalWordLength;
        int spaces = line.length - 1;
        int iterations = spaces > 0 ? interval / spaces : 0;
        int end = spaces > 0 ? interval % spaces : 0;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length; i++) {
            result.append(line[i]);
            if (i < line.length - 1) {
                result.append(" ".repeat(iterations));
                if (i < end) {
                    result.append(" ");
                }
            }
        }

        System.out.println(result);
    }
}
