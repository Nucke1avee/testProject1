package testField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestField3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        String s = "";
        String[] tmp;

        //читаем строку и убираем из нее все буквы и лишние пробелы
        s = reader.readLine().replaceAll("[a-zA-Z]", " ").replaceAll("\\s{2,}", " ");
        tmp = s.split(" "); //разбиваем по пробелу и пишем во временный массив
        for (String str : tmp) {  //идем по временному массиву и пытаемся превратить значение элемента массива в инт
            try {
                set.add(Integer.parseInt(str));
                //если получилось - добавили в сет
                //в сете могут лежать только уникальные значения
            } catch (Throwable ignore) {}  //не получилось? ну и хрен с ним, берем следующий элемент
        }
        ArrayList<Integer> list = new ArrayList<>(set); //перетаскиваем элементы сета в arraylist
        set.clear(); //чистим сет, ибо нефиг
        Collections.sort(list); //сортируем arraylist в возрастающем порядке
        try {
            System.out.println("min1 = " + list.get(0) + "; min2 = " + list.get(1)); //выводим первый и второй элементы
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Слишком мало значений!"); //если значений <2 - пишем ошибку
        }
    }
}
