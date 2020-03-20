package org.jakumo.euler.e015;

//        Начиная в левом верхнем углу сетки 2×2 (имеется в виду 3х3)
//        и имея возможность двигаться только вниз или вправо,
//        существует ровно 6 маршрутов до правого нижнего угла сетки.
//
//        * * *
//        * * *
//        * * *
//
//        Сколько существует таких маршрутов в сетке 20×20 (21x21)?

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Execution time = 480ms
        System.out.println("Result: " + getAmountOfPaths(21, 21) + " paths");
    }

    private static int getAmountOfPaths(int cols, int rows) {
        HashSet<String> hs = new HashSet<>();
        int cursor;
        int iterationsAmount = cols * rows * (cols + rows);
        int maxCursor = cols + rows * 10;
        String path;

        for (int i = 0; i < iterationsAmount; i++) {
            cursor = 11;
            path = "path_";

            while (cursor < maxCursor) {
                if (Math.random() > 0.5) {
                    if (cursor % 10 < cols) { //есть еще место справа?
                        cursor += 1; //идем направо
                        path = path.concat(cursor + "");
                    } else { //места нет, идем до упора вниз
                        cursor += 10;
                        path = path.concat(cursor + "");
                    }
                } else {
                    if (cursor / 10 < rows) { //есть еще место внизу?
                        cursor += 10; //идем вниз
                        path = path.concat(cursor + "");
                    } else { //места нет, идем до упора вправо
                        cursor += 1;
                        path = path.concat(cursor + "");
                    }
                }
            }
            hs.add(path);
        }
        return hs.size();
    }
}
