package org.jakumo.euler.e016;

//        2^15 = 32768, сумма цифр этого числа равна 3 + 2 + 7 + 6 + 8 = 26.
//        Какова сумма цифр числа 2^1000?

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Throwable {
        //Execution time = 56ms
        //Answer = 1366
        int result = 0;
        BigInteger bi_pow = BigInteger.valueOf(2).pow(1000);
        String[] tmp = bi_pow.toString().split("");
        for (String s : tmp) result += Integer.parseInt(s);
        System.out.println("Result: " + result + "\n2^1000 = " + bi_pow);
    }
}
