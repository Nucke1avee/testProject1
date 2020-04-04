package org.jakumo.euler.e007;
/*Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-ое простое число - 13.
  Какое число является 10001-ым простым числом?*/
public class Main {
    public static void main(String[] args) {
        //Execution time ~50ms
        //Answer = 104743
        int i, counter = 0;
        for (i = 2; counter != 10001; i++) {
            if (isPrime(i)) counter++;
        }
        System.out.println("Result: " + (i - 1));
    }
    //true - число простое, false - нет
    private static boolean isPrime(int i) {
        if (i < 2) return false;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
