package com.lab2.task3;

import java.util.*;

/**
 * A class that demonstrates the calculation of Fibonacci numbers using an iterative approach
 * with a pre-allocated array, avoiding recursion. The array stores Fibonacci numbers as they are
 * calculated, and subsequent calls reuse previously computed values for efficiency.
 */
public class Main {
    private static final long[] arr = new long[94];
    private static int last = 0;

    static {
        arr[0] = 0;
        arr[1] = 1;
    }

    /**
     * Calculates the Fibonacci number at the specified index using an iterative approach.
     * If the Fibonacci number at the given index has not been calculated yet, it computes
     * all necessary Fibonacci numbers up to that index and stores them in the array.
     *
     * @param n the index of the Fibonacci number to calculate (must be non-negative and less than 94)
     * @return the Fibonacci number at index n
     * @throws ArrayIndexOutOfBoundsException if n is negative or greater than or equal to 94
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

    /**
     * The main method that prompts the user to enter an index, calculates the corresponding
     * Fibonacci number using the fibonacci method, and prints the result.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fibonacci(n));
    }
}
