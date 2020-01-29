package org.jakumo.euler.e3;
//Простые делители числа 13195 - это 5, 7, 13 и 29.
//Каков самый большой делитель числа 600851475143, являющийся простым числом?
public class Main {
    public static void main(String[] args) {
        //execution time ~25ms
        long num = 600851475143L;
        int maxDel = 0;

        for (int i = 2; i <= num; i++) {
            if ((num % i == 0) && isSimple(i)) {
                num /= i;
                maxDel = i;
            }
        }
        System.out.println("\nResult: " + maxDel);
    }

    private static boolean isSimple(int i) {
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) count++;
        }
        return count == 2;
    }
}
