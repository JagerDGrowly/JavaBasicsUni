package com.lab2.task2;

/**
 * A class that implements the Sieve of Eratosthenes algorithm to find prime numbers
 * from 1 to a specified size (100 by default) without using division or modulo operations.
 * The array is filled with consecutive positive integers, non-prime numbers are replaced
 * with -1, and the remaining positive values (prime numbers) are printed.
 */
public class Main {
    private static final int size = 100;
    private static final int[] numbers = new int[size];

    static {
        numbers[0] = -1;
    }

    /**
     * The main method that orchestrates the process of filling the array,
     * identifying non-prime numbers, and printing the prime numbers.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        fillArray();
        changeValuesOfArray();
        printArray();
    }

    /**
     * Fills the array with consecutive positive integers from 1 to size.
     * Note that the first element (index 0) is already set to -1 in the static block
     * as 1 is not a prime number.
     */
    public static void fillArray() {
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }
    }

    /**
     * Identifies non-prime numbers in the array using a modified Sieve of Eratosthenes
     * algorithm without division or modulo operations. Non-prime numbers are replaced
     * with -1 by marking all multiples of each prime number starting from 2.
     */
    public static void changeValuesOfArray() {
        for (int i = 1; i < size; i++) {
            if (numbers[i] == -1) {
                continue;
            }

            int prime = numbers[i];
            int multiple = prime;

            while (multiple <= size) {
                int index = multiple - 1;

                if (index < size && numbers[index] != prime) {
                    numbers[index] = -1;
                }
                multiple = multiple + prime;
            }
        }
    }

    /**
     * Prints all positive values remaining in the array, which represent the prime numbers
     * from 1 to size. Non-prime numbers have been replaced with -1 and are not printed.
     */
    public static void printArray() {
        System.out.println("Prime numbers from 1 to " + size + ":");

        for (int i = 0; i < size; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
