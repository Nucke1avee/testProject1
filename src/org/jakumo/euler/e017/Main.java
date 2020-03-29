package org.jakumo.euler.e017;

//Если записать числа от 1 до 5 английскими словами (one, two, three, four, five), то используется всего 3 + 3 + 5 + 4 + 4 = 19 букв.
//Сколько букв понадобится для записи всех чисел от 1 до 1000 (one thousand) включительно?
//
//Примечание: Не считайте пробелы и дефисы. Например, число 342 (three hundred and forty-two)
//состоит из 23 букв, число 115 (one hundred and fifteen) - из 20 букв. Использование "and" при записи чисел соответствует правилам британского английского.

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println("Result: " + getAmountOfLetters(1));

        System.out.println("\nExecution time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static int getAmountOfLetters(int i) {
        int lettersAmount = 0;


        return lettersAmount;
    }

    private int dic(int i) {
        String num = "";

        switch (i) {
            case 0:
                num = "zero";
                break;
            case 1:
                num = "one";
                break;
            case 2:
                num = "two";
                break;
            case 3:
                num = "three";
                break;
            case 4:
                num = "four";
                break;
            case 5:
                num = "five";
                break;
            case 6:
                num = "six";
                break;
            case 7:
                num = "seven";
                break;
            case 8:
                num = "eight";
                break;
            case 9:
                num = "nine";
                break;
            case 10:
                num = "ten";
                break;
            case 11:
                num = "eleven";
                break;
            case 12:
                num = "twelve";
                break;
            case 13:
                num = "thirteen";
                break;
            case 14:
                num = "fourteen";
                break;
            case 15:
                num = "fifteen";
                break;
            case 16:
                num = "sixteen";
                break;
            case 17:
                num = "seventeen";
                break;
            case 18:
                num = "eighteen";
                break;
            case 19:
                num = "nineteen";
                break;
            case 20:
                num = "twenty";
                break;
            case 30:
                num = "thirty";
                break;
            case 40:
                num = "forty";
                break;
            case 50:
                num = "fifty";
                break;
            case 60:
                num = "sixty";
                break;
            case 70:
                num = "seventy";
                break;
            case 80:
                num = "eighty";
                break;
            case 90:
                num = "ninety";
                break;
            case 100:
                num = "hundred";
                break;
            case 1000:
                num = "thousand";
                break;
        }
        return 0;
    }
}