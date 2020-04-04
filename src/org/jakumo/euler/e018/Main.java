package org.jakumo.euler.e018;

//        Начиная в вершине треугольника (см. пример ниже) и перемещаясь вниз на
//        смежные числа, максимальная сумма до основания составляет 23.
//
//           3
//          7 4
//         2 4 6
//        8 5 9 3
//
//        То есть, 3 + 7 + 4 + 9 = 23.
//
//        Найдите максимальную сумму пути от вершины до основания следующего треугольника:
//
//                      75
//                     95 64
//                    17 47 82
//                   18 35 87 10
//                  20 04 82 47 65
//                 19 01 23 75 03 34
//                88 02 77 73 07 63 67
//               99 65 04 28 06 16 70 92
//              41 41 26 56 83 40 80 70 33
//             41 48 72 33 47 32 37 16 94 29
//            53 71 44 65 25 43 91 52 97 51 14
//           70 11 33 28 77 73 17 78 39 68 17 57
//          91 71 52 38 17 14 91 43 58 50 27 29 48
//         63 66 04 68 89 53 67 30 73 16 69 87 40 31
//        04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
//
//        Примечание: Так как в данном треугольнике всего 16384 возможных маршрута от вершины до основания,
//        эту задачу можно решить проверяя каждый из маршрутов. Однако похожая Задача 67 с треугольником,
//        состоящим из сотни строк, не решается перебором (brute force) и требует более умного подхода! ;o)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Execution time = 40ms
        //Answer = 1074
        String path = "./src/org/jakumo/euler/e018/triangle.txt";
        System.out.println("Result: " + getMaxSum(path));
    }

    private static int getMaxSum(String filepath) {
        int triangleHeight = makeArrayFromFile (filepath, " ");
        int[][] arrayCopy = array;
        for (int i = triangleHeight - 2; i >= 0 ; i--) {
            for (int j = 0; j < arrayCopy[i].length; j++) {
                arrayCopy[i][j] += Math.max(arrayCopy[i + 1][j], arrayCopy[i + 1][j + 1]);
            }
        }
        return arrayCopy[0][0];
    }

    private static int[][] array;
    //инициализирует массив (треугольник) и возвращает его высоту
    private static int makeArrayFromFile(String filepath, String splitRegex) {
        int linesAmount = 0;
        String[] line;
        try {
            File file = new File(filepath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            bufferedReader.mark((int) file.length() + 1);
            while (bufferedReader.ready()) {
                bufferedReader.readLine();
                linesAmount++;
            }
            array = new int[linesAmount][];
            for (int i = 0; i < linesAmount; i++) {
                array[i] = new int[i + 1];
            }
            linesAmount = 0;
            bufferedReader.reset();
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine().split(splitRegex);
                for (int i = 0; i < line.length; i++) {
                    array[linesAmount][i] = Integer.parseInt(line[i]);
                }
                linesAmount++;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesAmount;
    }
}
