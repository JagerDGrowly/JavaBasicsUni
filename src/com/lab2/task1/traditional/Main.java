package com.lab2.task1.traditional;

import java.util.*;

/**
 * The class demonstrates the ability to get the maximum column values
 * in a two-dimensional array and created without using java.util.arrays
 */
public class Main {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int from = 4;
        int to = 33;

        int[][] arr = new int[m][];
        int[] maxes = new int[m];
        String[] linesArr = new String[m];
        Random r = new Random();

        System.out.print("Enter a char: ");
        String symbol = new Scanner(System.in).nextLine();

        makeArray(arr, r, n, from, to);
        makeArray(arr, maxes);
        makeArray(maxes, linesArr, symbol);
    }

    /**
     * Creates and fills a two-dimensional array with random integers
     * in the specified range and displays it in the console.
     *
     * @param arr a two-dimensional array to be filled (rows must be initialized to null)
     * @param r Random object for generating random numbers
     * @param n the number of columns in each row of the array
     * @param from lower bound of the range for random numbers (inclusive)
     * @param to upper limit of the range for random numbers (not inclusive)
     */
    public static void makeArray(int[][] arr, Random r, int n, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fillRow(r, n, from, to);
        }

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.print("]");

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /**
     * Calculates the maximum values for each row of a two-dimensional array,
     * saves them to the maxes array and prints the result to the console.
     *
     * @param arr a two-dimensional array from which the maximums of strings are calculated
     * @param maxes an array to store the maximum values (must have a size equal to the number of lines in arr)
     */
    public static void makeArray(int[][] arr, int[] maxes) {
        for (int i = 0; i < maxes.length; i++) {
            maxes[i] = getMaxInRow(arr, i);
        }

        System.out.print("[");

        for (int i = 0; i < maxes.length; i++) {
            System.out.print(maxes[i]);

            if (i < maxes.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    /**
     * Creates an array of strings, where each string consists of a repeating
     * character symbol, the number of repetitions of which is determined by
     * the corresponding element of the maxes array, and outputs each string to the console.
     *
     * @param maxes an array of integers that defines the number of character repetitions for each line
     * @param linesArr an array of strings to be filled (must have a size equal to the size of maxes)
     * @param symbol a character that will be repeated to create strings
     */
    public static void makeArray(int[] maxes, String[] linesArr, String symbol) {
        for (int i = 0; i < linesArr.length; i++) {
            linesArr[i] = symbol.repeat(maxes[i]);
        }

        for (String s : linesArr) {
            System.out.println(s);
        }
    }

    /**
     * Creates an array of integers and fills it with values from the specified range
     *
     * @param random current Random type object used for filling row
     * @param size array length
     * @param from left limit of the range
     * @param to right boundary of the range
     * @return an array of integers with random values
     */
    public static int[] fillRow(Random random, int size, int from, int to) {
        int[] result = new int[size];

        for (int j = 0; j < size; j++) {
            result[j] = Math.abs(random.nextInt() % (to - from)) + from;
        }

        return result;
    }

    /**
     * Calculates the maximum value of row elements in a two-dimensional array
     *
     * @param arr source array
     * @param i column index
     * @return minimum value
     */
    public static int getMaxInRow(int[][] arr, int i) {
        int max = arr[i][0];

        for (int j = 1; j < arr[i].length; j++) {
            if (arr[i][j] > max) {
                max = arr[i][j];
            }
        }

        return max;
    }
}