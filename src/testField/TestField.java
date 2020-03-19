package testField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestField {
    public static void main(String[] args) throws Throwable {
        //arraylist заполнение = 1200
        //linkedlist заполнение = 1800
        //arraylist вставка в начало = не справился
        //      16000ms при в 100 раз меньше значений
        //      11000ms вставка в середину (1/4)
        //linkedlist вставка в середину = 2600


        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");


    }
}
