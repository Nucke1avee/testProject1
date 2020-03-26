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
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //Execution time = 45s
        //корректный ответ - 137846528820
        //не соответствует - нужно переделать. на небольших матрицах работает гуд, с большими все плохо...

        System.out.println("Result: " + getAmountOfPaths(3, 3) + " paths");

        System.out.println("\nExecution time: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static long getAmountOfPaths(int cols, int rows) {
        HashSet<String> hs = new HashSet<>();
        int cursorX;
        int cursorY;
        String path;

        final boolean[] hasTime = {true};
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                hasTime[0] = false;
            }
        };
        timer.schedule(task, 60000);

        int iterationsAmount = cols * rows * cols * rows * (cols + rows) / 2;
        Random random = new Random();

        for (int i = 0; i < iterationsAmount && hasTime[0]; i++) {
            cursorX = 1;
            cursorY = 1;
            path = "path = ";
            while (cursorX < cols || cursorY < rows) {
                if (random.nextBoolean()) {
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