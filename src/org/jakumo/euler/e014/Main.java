package org.jakumo.euler.e014;

//Следующая повторяющаяся последовательность определена для множества натуральных чисел:
//
//        n → n/2 (n - четное)
//        n → 3n + 1 (n - нечетное)
//
//        Используя описанное выше правило и начиная с 13, сгенерируется следующая последовательность:
//
//        13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//        Получившаяся последовательность (начиная с 13 и заканчивая 1) содержит 10 элементов. Хотя это до сих пор и не доказано (проблема Коллатца (Collatz)), предполагается, что все сгенерированные таким образом последовательности оканчиваются на 1.
//
//        Какой начальный элемент меньше миллиона генерирует самую длинную последовательность?
//
//        Примечание: Следующие за первым элементы последовательности могут быть больше миллиона.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //Execution time =
        //java.lang.OutOfMemoryError: Java heap space
        //но до 100000 работаеет отлично

        int maxStartNum = getMaxStaringNum(1000000);
        System.out.println("Result: " + maxStartNum);
        System.out.println("The sequence is: " + getSequence(maxStartNum));

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");
    }

    private static int getMaxStaringNum(int to) {
        int maxNum = 0, maxSeqSize = 0;
        for (int i = 1; i <= to; i++) {
            int sequenceSize = getSequence(i).size();
            if (sequenceSize > maxSeqSize) {
                maxNum = i;
                maxSeqSize = sequenceSize;
            }
        }
        return maxNum;
    }

    private static ArrayList<Integer> getSequence(int startingNumber) {
        ArrayList<Integer> collatzSequence = new ArrayList<>();
        collatzSequence.add(startingNumber);
        int collatzLastElem = collatzSequence.get(collatzSequence.size() - 1);
        while (!(collatzLastElem == 1)) {
            if (isEven(collatzLastElem)) collatzSequence.add(collatzLastElem / 2);
            else collatzSequence.add(collatzLastElem * 3 + 1);
            collatzLastElem = collatzSequence.get(collatzSequence.size() - 1);
        }
        return collatzSequence;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
