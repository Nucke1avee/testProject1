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
        long startTime = System.currentTimeMillis();
        //Execution time = 45s

        System.out.println("Result: " + getAmountOfPaths(21, 21) + " paths");

        System.out.println("\nExecution time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static int getAmountOfPaths(int cols, int rows) {
        HashSet<String> hs = new HashSet<>();
        int cursorX;
        int cursorY;
        String path;

        int iterationsAmount = cols * rows * cols * rows * 16;
        //TODO: отсечку по времени бы вкрячить неплохо было б...

        for (int i = 0; i < iterationsAmount; i++) {
            cursorX = 1;
            cursorY = 1;
            path = "path = ";
            while (cursorX < cols || cursorY < rows) {
                if (Math.random() > 0.5) {
                    if (cursorX < cols) { //есть еще место справа?
                        cursorX += 1; //идем направо
                    } else { //места нет, идем до упора вниз
                        cursorY += 1;
                    }
                } else {
                    if (cursorY < rows) { //есть еще место внизу?
                        cursorY += 1; //идем вниз
                    } else { //места нет, идем до упора вправо
                        cursorX += 1;
                    }
                }
                path = path.concat(cursorX + "." + cursorY + " ");
            }
            System.out.println(path);
            hs.add(path);
        }
        return hs.size();
    }
}
