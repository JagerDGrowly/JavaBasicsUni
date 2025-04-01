package com.lab2.task3;

import java.util.*;

/**
 * The class demonstrates how fibonacci number calculation works
 * without using static final array instead of recursion function
 */
public class Main {
    private static final long[] arr = new long[94];
    private static int last = 0;

    static {
        arr[0] = 0;
        arr[1] = 1;
    }

    /**
     * Calculates fibonacci number
     *
     * @param n index of fibonacci number
     * @return fibonacci number of index n
     */
    public static long fibonacci(int n) {
        if (n > last) {
            for (int i = last + 2; i <= n + 1; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }

            last = n;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fibonacci(n));
    }
}
