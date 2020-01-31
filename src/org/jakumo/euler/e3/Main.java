package org.jakumo.euler.e3;
//Простые делители числа 13195 - это 5, 7, 13 и 29.
//Каков самый большой делитель числа 600851475143, являющийся простым числом?
public class Main {
    public static void main(String[] args) {
        //execution time ~20ms
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
        for (int j = 1, count = 0; j <= Math.sqrt(i); j++) {
            if (i % j == 0) count++;
            if (count > 1) return false;
        }
        return true;
    }
}
