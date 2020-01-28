package org.jakumo.euler.e1;

//Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
//Найдите сумму всех чисел меньше 1000, кратных 3 или 5.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        System.out.print("Enter your number: ");
        int input = Integer.parseInt(reader.readLine()); //тут еще, по-хорошему надо try/catch рисовать
        for (int i = 0; i < input; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Result: " + sum);
    }
}
