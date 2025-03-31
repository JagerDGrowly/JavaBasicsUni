package com.lab1.task2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void printPowDefault(int n) {
        System.out.println("Перший підхід: ");
        for (int i = 1; i <= n; i++) {
            System.out.printf(" 8 ^ %d = %d\n", i, (long)pow(8, i));
            System.out.println(" 8 ^ " + i + " = " + Long.toBinaryString((long)pow(8, i)));
        }
    }

    public static void printPowBitwise(int n) {
        System.out.println("Другий підхід: ");
        for (int i = 1; i <= n; i++) {
            long result = 1;
            long base = 8;
            int j = i;

            while (j > 0) {
                if ((j & 1) == 1) {
                    result *= base;
                }
                base *= base;
                j >>= 1;
            }

            System.out.printf(" 8 ^ %d = %d\n", i, result);
            System.out.println(" 8 ^ " + i + " = " + Long.toBinaryString(result));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть значення n від 0 до 10: ");
        int n = s.nextInt();

        if (n < 0 || n > 10) {
            System.err.println("Значення n невірне!");
        }
        else {
            printPowDefault(n);
            printPowBitwise(n);
        }
    }
}
