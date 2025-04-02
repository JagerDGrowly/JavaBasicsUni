package com.lab2.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int interval = n - args[0].length();
        String[] line = args[0].split(" ");
        int spaces = line.length - 1;
        int iterations = interval / spaces;
        int end = interval % spaces;

        for (int i = 0; i < line.length; i++) {
            line[i] = line[i].concat(" ").repeat(iterations);
        }

        for (int i = 0; i < end; i++) {
            line[i] = line[i].concat(" ");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length - 1; i++) {
            result.append(line[i]);
        }
        System.out.println(result);
    }
}
