package com.lab1.task3;

import java.util.Scanner;

public class Main {
    public static double f(double x, int n) {
        boolean yTouched = false;
        double y = 1;

        label:
        for (int i = 1; i <= (n - 1); i++) {
            double k = 0;

            for (int j = 0; j <= n; j++) {
                if (i == (j + x)) {
                    continue label;
                } else if ((j + x) == 0) {
                    System.err.println("Помилка!");
                    y = Double.NaN;
                    break label;
                } else {
                    k += i / (j + x);
                }
            }

            y *= k;
            yTouched = true;
        }

        if (!yTouched) {
            y = Double.NaN;
        }

        return y;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = s.nextDouble();
        System.out.print("Введіть значення n: ");
        int n = s.nextInt();

        double y = f(x, n);
        if (!Double.isNaN(y)) {
            System.out.printf("y = %f\n", y);
        }
    }
}
