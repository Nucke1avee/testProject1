package org.jakumo.euler.e9;
/*Тройка Пифагора - три натуральных числа a < b < c, для которых выполняется равенство

        a^2 + b^2 = c^2
        Например, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

        Существует только одна тройка Пифагора, для которой a + b + c = 1000.
        Найдите произведение abc.*/
public class Main {
    public static void main(String[] args) {
        //задача, которая не сколько про алгоритм, сколько, скорее, про математику
        //хотя, возможно, есть и более программистское решение, но это не точно...

        //итак, что мы имеем по условию:
        //a^2 + b^2 - c^2 = 0
        //a + b + c = 1000

        //вспоминаем школу - системы уравнений и формулы сокращенного умножения:
        //c = 1000 - a - b                                           // (a - b)^2 = a^2 - 2ab + b^2
        //a^2 + b^2 - (1000 - a - b)^2 = 0    // (1000 - (a + b))^2  // 1000^2 - 2000(a + b) + (a + b)^2
        //(a + b)^2 - 2ab - 1000^2 + 2000a + 2000b - a^2 - 2ab - b^2 = 0
        //a^2 + 2ab + b^2 - 4ab - 1000^2 + 2000a + 2000b - a^2 - b^2 = 0
        //- 2ab - 1000^2 + 2000a + 2000b = 0
        //после этого хао... кхм... этих преобразований получаем что-то вроде:
        //1000(a + b) - ab = 500000
        //с этим уже можно кой чего сделать. да-да, брутфорсим)) благо перебирать совсем чуть-чуть
        int a, b, temp = 1;
        for (a = 1; a < 400 && temp != 0; a++) {        //откуда 400? мы же помним про то, что у нас 3 числа,
            for (b = 1; b < 400; b++) {                 //которые в сумме дают 1000 и a < b < c ?
                if (1000 * (a + b) - a * b == 500000) { //400 - треть от 1000 с небольшим запасом =)
                    if (a > b) {
                        temp = a;
                        a = b;
                        b = temp;
                    }
                    System.out.println("a = " + a + " b = " + b);
                    temp = 0;
                    break;
                }
            }
        }
        //ага, a = 200 и b = 375, значит c = 1000 - 200 - 375 = 425
        //итого a = 200, b = 375, c = 425
        System.out.println("Result (a * b * c) = " + 200 * 375 * 425);
        System.out.print("...иии небольшая последняя проверка:\na^2 + b^2 = " + 200*200 + " + " + 375*375);
        System.out.print(" = " + (200*200 + 375*375) + ";  c^2 = " + 425*425 + "\nКажись сходится =)");
    }
}
