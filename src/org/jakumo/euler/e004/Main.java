package org.jakumo.euler.e004;
/*Число-палиндром с обеих сторон (справа налево и слева направо) читается одинаково.
  Самое большое число-палиндром, полученное умножением двух двузначных чисел – 9009 = 91 × 99.
      Найдите самый большой палиндром, полученный умножением двух трехзначных чисел.*/
public class Main {
    public static void main(String[] args) {
        //Execution time ~35ms
        //Answer = 906609
        boolean isFound = false;
        int result = 0;
        for (int i = 999; i >= 100 || !isFound; i--) {
            for (int j = 999; j >= 100; j--) {
                if (i * j > result && isPalindrome(i * j)) {
                    isFound = true;
                    result = i * j;
                    break;
                }
            }
        }
        System.out.println("Result: " + result);
    }
    //разбиваем на массив чаров и циклом сравниваем 1й символ с последним (двигаясь от краев к центру)
    private static boolean isPalindrome(int i) {
        char[] s = Integer.toString(i).toCharArray();
        for (int j = 0, k = s.length - 1; j < s.length / 2; j++, k--) {
            if (s[j] != s[k]) return false;
        }
        return true;
    }
}
