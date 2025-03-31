package com.lab2.task1.arrays;

import java.util.*;

public class TwoArrayDemo {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;

        int from = 4;
        int to = 33;

        int[][] arr = new int[m][];
        Random r = new Random();
        Arrays.setAll(arr, i -> fillRow(r, n, from, to));
        System.out.println(Arrays.deepToString(arr));

        int[] maxes = new int[m];
        Arrays.setAll(maxes, i -> getMaxInRow(arr, i));
        System.out.println(Arrays.toString(maxes));
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
