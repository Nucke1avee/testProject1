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

public class Main {
    public static void main(String[] args) {
        //Execution time = 650ms
        System.out.println("Result: " + getMaxStaringNum(1000000));
    }

    private static int getMaxStaringNum(int to) {
        int maxNum = 0, maxSeqSize = 0;
        for (int i = 1; i <= to; i++) {
            int sequenceSize = getCollatzSequenceLength(i);
            if (sequenceSize > maxSeqSize) {
                maxNum = i;
                maxSeqSize = sequenceSize;
            }
        }
        return maxNum;
    }

    private static int getCollatzSequenceLength(int startingNumber) {
        int curLength = 0;
        long curNumber = startingNumber;
        while (!(curNumber == 1)) {
            if (isEven(curNumber)) {
                curNumber = curNumber / 2;
            } else {
                curNumber = curNumber * 3 + 1;
            }
            curLength++;
        }
        return curLength;
    }

    private static boolean isEven(long num) {
        return num % 2 == 0;
    }
}
