package org.jakumo.euler.e017;

//Если записать числа от 1 до 5 английскими словами (one, two, three, four, five), то используется всего 3 + 3 + 5 + 4 + 4 = 19 букв.
//Сколько букв понадобится для записи всех чисел от 1 до 1000 (one thousand) включительно?
//
//Примечание: Не считайте пробелы и дефисы. Например, число 342 (three hundred and forty-two)
//состоит из 23 букв, число 115 (one hundred and fifteen) - из 20 букв. Использование "and" при записи чисел соответствует правилам британского английского.

public class Main {
    public static void main(String[] args) {
        //Кривенько, косенько, но задачу решает и вполне себе шустро (ну и в кой-то веке рекурсия пригодилась) =)
        //Execution time = 60ms
        System.out.println("Result: " + getAmountOfAllLettersTo(1000)); //максимальное число = 9999, что не есть гуд...
    }

    private static int getAmountOfAllLettersTo(int i) {
        int lettersAmount = 0;
        for (int j = 1; j <= i; j++) {
            lettersAmount += dict(j).replaceAll("[ -]", "").length(); //удаляем все пробелы и тире
        }
        return lettersAmount;
    }

    private static String dict(int i) {
        String num = "";
        String[] numSplit;

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
            default:  //нет в списке? тогда мы идем к... ээ... разбиваем, крч, на отдельные части
                numSplit = String.valueOf(i).split(""); //хотя не уверен что нельзя было проще сделать
                switch (numSplit.length) {
                    case 2:  //десятки
                        num = dict(Integer.parseInt(numSplit[0]) * 10) + "-" + dict(i % 10);
                        break;
                    case 3:  //сотни
                        //если нет десятков и на конце ноль
                        if (Integer.parseInt(numSplit[2]) == 0 && Integer.parseInt(numSplit[1]) == 0) {
                            num = dict(Integer.parseInt(numSplit[0])) + " hundred";
                        } else {
                            num = dict(Integer.parseInt(numSplit[0])) + " hundred and " + dict(i % 100);
                        }
                        break;
                    case 4:  //тысячи
                        //если нет сотен, десятков и на конце ноль
                        if (Integer.parseInt(numSplit[3]) == 0 && Integer.parseInt(numSplit[2]) == 0 && Integer.parseInt(numSplit[1]) == 0) {
                            num = dict(Integer.parseInt(numSplit[0])) + " thousand";
                        } else {
                            num = dict(Integer.parseInt(numSplit[0])) + " thousand " + dict(i % 1000);
                        }
                        break;
                }
        }
        return num;
    }
}