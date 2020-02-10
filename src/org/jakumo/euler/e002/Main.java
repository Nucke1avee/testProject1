package org.jakumo.euler.e002;
/*Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.*/
public class Main {
    public static void main(String[] args) {
        //execution time ~20ms
        int[] a = {1, 2, 3};
        int sum = 0;
        for (int i = 0; a[i % 3] < 4000000; i++) {
            if (a[i % 3] % 2 == 0) sum += a[i % 3];
            a[i % 3] = a[(i + 1) % 3] + a[(i + 2) % 3];
        }
        System.out.println("\nResult: " + sum);
    }
}
