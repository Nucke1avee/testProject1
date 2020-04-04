package org.jakumo.euler.e010;

import useful.PrimeCheck;
//Сумма простых чисел меньше 10 равна 2 + 3 + 5 + 7 = 17.
//Найдите сумму всех простых чисел меньше двух миллионов.
public class Main {
    public static void main(String[] args) {
        //Execution time ~ 820ms
        //Answer = 142913828922
        long sum = 0;
        for (int i = 1; i <= 2000000; i++)
            if (PrimeCheck.isPrime(i)) sum += i;
        System.out.println("Result: " + sum);
    }
}
