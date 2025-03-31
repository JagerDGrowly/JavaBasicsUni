package com.lab1.task1;

import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class Main {
    public static double f(double x) {
        final int n = 6;
        double y;

        if (x < 5) {
            y = 0;
            for (int i = 1; i <= n; i++) {
                y += pow(i, (x - 4));
            }
        }
        else {
            y = cos((0.2 * x) - 1) + x + 15;
        }

        return y;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введіть значення початку інтервалу: ");
        double a = s.nextDouble();
        System.out.println("Введіть значення кінця інтервалу: ");
        double b = s.nextDouble();
        System.out.println("Введіть значення кроку: ");
        double step = s.nextDouble();

        while (a <= b) {
            double y = f(a);
            System.out.printf("x = %f, y = %f\n", a, y);
            a += step;
        }
    }
}
