package com.lab1.task5.src;

import com.lab1.task5.lib.Library;

import java.util.Scanner;

import static com.lab1.task5.lib.Library.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Звичайний імпорт: ");

        System.out.print("  Boolean to Byte: ");
        System.out.printf("%d\n", Library.boolToByte(s.nextBoolean()));
        System.out.print("  Int to Boolean: ");
        System.out.printf("%b\n", Library.intToBool(s.nextInt()));
        System.out.print("  Function: ");
        System.out.printf("%f\n", Library.function(s.nextInt()));

        System.out.println("Статичний імпорт: ");

        System.out.print("  Boolean to Byte: ");
        System.out.printf("%d\n", boolToByte(s.nextBoolean()));
        System.out.print("  Int to Boolean: ");
        System.out.printf("%b\n", intToBool(s.nextInt()));
        System.out.print("  Function: ");
        System.out.printf("%f\n", function(s.nextInt()));
    }
}
