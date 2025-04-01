package com.lab2.task1.arrays;

import java.util.*;

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

    public static void makeArray(int[][] arr, Random r, int n, int from, int to) {
        Arrays.setAll(arr, i -> fillRow(r, n, from, to));
        System.out.println(Arrays.deepToString(arr));
    }

    public static void makeArray(int[][] arr, int[] maxes) {
        Arrays.setAll(maxes, i -> getMaxInRow(arr, i));
        System.out.println(Arrays.toString(maxes));
    }

    public static void makeArray(int[] maxes, String[] linesArr, String symbol) {
        Arrays.setAll(linesArr, i -> symbol.repeat(maxes[i]));
        Arrays.stream(linesArr).forEach(System.out::println);
    }

    public static int[] fillRow(Random random, int size, int from, int to) {
        int[] result = new int[size];
        Arrays.setAll(result, j -> Math.abs(random.nextInt() % (to - from)) + from);
        return result;
    }

    public static int getMaxInRow(int[][] arr, int i) {
        int[] row = new int[arr[i].length];
        Arrays.setAll(row, j -> arr[i][j]);
        Arrays.sort(row);
        return row[row.length - 1];
    }
}
