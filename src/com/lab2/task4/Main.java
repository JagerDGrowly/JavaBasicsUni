package com.lab2.task4;

import java.util.*;

public class Main {
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
