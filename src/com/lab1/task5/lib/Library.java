package com.lab1.task5.lib;

import static java.lang.Math.sin;

public class Library {
    public static int boolToByte(boolean a) {
        if (a) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static boolean intToBool(int a) {
        return a != 0;
    }

    public static double function(int a) {
        double b = switch (a) {
            case 0: yield 2;
            case 1: yield 4;
            case 2: yield 5;
            case 3: yield 3;
            case 4: yield 1;
            default: yield (a + sin(a));
        };

        return b;
    }
}
