package org.example;

@FunctionalInterface
interface NumberChecker {
    boolean check(int number);
}

public class Main {
    public static void main(String[] args) {
        // Реализация интерфейса через лямбда-выражение
        NumberChecker isDivisibleBy13 = number -> number % 13 == 0;

        // Тестирование
        int testNumber1 = 26;
        int testNumber2 = 15;

        System.out.println(testNumber1 + " делится на 13: " + isDivisibleBy13.check(testNumber1));
        System.out.println(testNumber2 + " делится на 13: " + isDivisibleBy13.check(testNumber2));
    }
}
