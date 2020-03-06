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
        System.out.println("Result: " + getFirstTriangleNumberWithThisAmountOfDivisors(300));

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");
    }

    private static long getFirstTriangleNumberWithThisAmountOfDivisors(int amountOfDivisorsYouNeed) {
        int amountOfDivisors, justCounter = 0;
        long number;
        while (true) {
            number = getTriangleNumberByOrder(justCounter);
            amountOfDivisors = amountOfDivisors(number);
            if (amountOfDivisors >= amountOfDivisorsYouNeed) return number;
            justCounter++;
        }
    }

    private static long getTriangleNumberByOrder(int orderNumber) {
        long triangleNumber = 0;
        for (int i = 0; i <= orderNumber; i++) {
            triangleNumber += i;
        }
        return triangleNumber;
    }

    private static int amountOfDivisors(long number) {
        int amount = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0) amount++;
        }
        return amount;
    }
}