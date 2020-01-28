package org.jakumo.euler.e2;

/*Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.*/

public class Main {
    public static void main(String[] args) {
        long[] a = {1, 2, 3};
        int j;
        long sum = 0;

        for (int i = 0; i < 50; i++) {
            j = i % 3;
            if (a[j] > 4000000) break;
            if (a[j] % 2 == 0) sum += a[j];
            System.out.print(a[j] + " ");
            a[j] = a[(i + 1) % 3] + a[(i + 2) % 3];
        }

        System.out.println();
        System.out.println("Result: " + sum);
    }
}
