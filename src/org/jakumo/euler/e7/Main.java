package org.jakumo.euler.e7;
/*Выписав первые шесть простых чисел, получим 2, 3, 5, 7, 11 и 13. Очевидно, что 6-ое простое число - 13.
  Какое число является 10001-ым простым числом?*/
public class Main {
    public static void main(String[] args) {
        //execution time ~50ms
        int counter = 0;
        int i;
        for (i = 2; counter != 10001; i++) {
            if (isSimple(i)) counter++;
        }
        System.out.println("Result: " + (i - 1));
    }

    private static boolean isSimple(int i) {
        if (i < 2) return false;
        for (int j = 1, count = 0; j <= Math.sqrt(i); j++) {
            if (i % j == 0) count++;
            if (count > 1) return false;
        }
        return true;
    }
}
