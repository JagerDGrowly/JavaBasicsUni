package com.lab2.task4;

import java.util.Scanner;

public class Main {
    private static final int n = new Scanner(System.in).nextInt();
    private static int spacesAmount = 0;

    public static void main(String[] args) {
        printResult(args[0]);
        String s = args[0];
        int length = s.length();
        setSpacesAmount(s, length);
        System.out.println(spacesAmount);
        printResult(addSpaces(s, length));
    }

    public static void printResult(String result) {
        System.out.println(result);
        System.out.println(result.length());
    }

    public static void setSpacesAmount(String s, int length) {
        String result = s;
        int endStringAmount;

        while (result.indexOf(' ') >= 0) {
            result = result.replaceAll(" ", "");
        }

        endStringAmount = result.length();
        spacesAmount += length - endStringAmount;
    }

    public static String addSpaces(String s, int length) {
//        есть интервал – разница между нынешней строкой, и сколько ей ещё нужно символов. есть
//        количество пробелов, благодаря этому я знаю сколько итераций функции мне надо для заполнения
//        всех пробелов на +1 пропуск. в цели оставить неполную последнюю итерацию, которая перейдёт
//        на следующую функцию, которая "закончит заполнение пробелов не всех сразу". для этого нужно
//        сделать цикл, индекс которого посчитается делением интервала на количество пробелов. Далее
//        проверка на остаток, в результате которой решиться переводить ли строку на след функцию.
//        интервал должен быть больше 0 не включительно. если меньше – ошибка, равно – возвращение,
//        меньше пробелов – переход в след функцию. Всё остальное – непредвиденная ошибка.
//
        if (interval(length) < 0) {
            System.err.println("Your number is less than amount of characters in argument: " + length);
        } else if (interval(length) == 0) {
            return s;
        } else if (interval(length) <= spacesAmount) {
            return finalizeSpaces(s);
        } else {
            System.err.println("Unexpected Error");
        }

//        если например 7, то цикл должен 2 раза, 0 - выполнился 1 раз и теперь 1.
//        1 - выполнился 2 раз и теперь 2.
        for (int i = 0; i < interval(length) / spacesAmount; i++) {
            s = s.replaceAll(" ", "  ");
        }

        if (interval(length) % spacesAmount > 0) {
            return finalizeSpaces(s);
        }

//        after finalizeSpaces() realization
        return s;
    }

    public static int interval(int length) { return n - length; }

    public static String finalizeSpaces(String s) {
//        тут я принимаю строку, высчитываю сколько надо добавить пропусков.
//        вызвав функцию интервала. надо реализовать постепенное добавление пробела к строке
//        поочерёдно
        return "Something";
    }
}
