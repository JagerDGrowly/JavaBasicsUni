package com.lab1.task4;

import java.util.Scanner;

public class Main {
    public static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void findMaxNForInt() {
        int a = 0, b = 1;
        int n = 0;

        while (true) {
            if (a < 0) {
                System.out.println("Максимальне n для int: " + (n - 1));
                break;
            }

            int next = a + b;
            a = b;
            b = next;
            n++;
        }
    }

    public static void findMaxNForLong() {
        long a = 0, b = 1;
        int n = 0;

        while (true) {
            if (a < 0) {
                System.out.println("Максимальне n для long: " + (n - 1));
                break;
            }

            long next = a + b;
            a = b;
            b = next;
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Введіть значення n: ");
        long n = s.nextLong();

        System.out.printf("F(%d) = %d\n", n, fibonacci(n));

        findMaxNForInt();
        findMaxNForLong();
    }
}
