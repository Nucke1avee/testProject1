package org.jakumo.euler.e5;
/*2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
Какое самое маленькое число делится нацело на все числа от 1 до 20?*/
public class Main {
    public static void main(String[] args) {
        //execution time ~25ms
        int to = 20;
        int nok = 1;
        for (int i = 2; i <= to; i++) {
            if (isSimple(i)) nok *= i;
        }

        for (int i = nok;; i += nok) {
            boolean isFound = false;

            for (int j = to;; j--) {
                if (i % j != 0) break;
                if (j == 2) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                System.out.println("Result: " + i);
                break;
            }
        }
    }
    private static boolean isSimple(int i) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) count++;
        }
        return count == 2;
    }
}
