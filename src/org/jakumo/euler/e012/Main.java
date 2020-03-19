package org.jakumo.euler.e012;

/*Последовательность треугольных чисел образуется путем сложения натуральных чисел.
К примеру, 7-ое треугольное число равно 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. Первые десять треугольных чисел:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Перечислим делители первых семи треугольных чисел:
 1: 1
 3: 1, 3
 6: 1, 2, 3, 6
10: 1, 2, 5, 10
15: 1, 3, 5, 15
21: 1, 3, 7, 21
28: 1, 2, 4, 7, 14, 28
Как мы видим, 28 - первое треугольное число, у которого более пяти делителей.

Каково первое треугольное число, у которого более пятисот делителей?*/

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //Execution time =
        //работает, но ооооооооооооооооочень долго. Надо переделывать
//        number: 76576500 aod: 576
//        Result: 76576500
//        Execution time: 689511 ms
        //"ну нахуй... буду проституткой"  (в смысле потом когда нибудь решу. может быть...)

        System.out.println("Result: " + getFirstTriangleNumberWithThisAmountOfDivisors(500));

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");
    }

    private static long getFirstTriangleNumberWithThisAmountOfDivisors(int amountOfDivisorsYouNeed) {
        int amountOfDivisors;
        long number;
        while (true) {
            number = getNextTriangleNumber();
            if (number % 2 != 0 || number % 5 != 0) continue;
            amountOfDivisors = amountOfDivisors(number);
            //System.out.println("number: " + number + " aod: " + amountOfDivisors);//
            if (amountOfDivisors >= amountOfDivisorsYouNeed) return number;
        }
    }

    private static long trNum = 1, trNumCounter = 1;

    private static long getNextTriangleNumber() {
        return trNum += ++trNumCounter;
    }

    private static int amountOfDivisors(long number) {
        int amount = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) amount++;
        }
        return amount;
    }
}