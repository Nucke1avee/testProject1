package testField;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class TestField1 {





    public static void readFileAndWriteAnswerInNewFile(String in, String out) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(in));
        String s = "";
        String[] tmp;

        ArrayList<Integer> list = new ArrayList<>();

        while (reader.ready()) {                                         // V тут пробел нада =)
            s = reader.readLine().replaceAll("[a-zA-Z]", " ").replaceAll("\\s{2,}", " "); //читаем строку и убираем из нее все буквы и лишние пробелы
            System.out.println("s = " + s);
            tmp = s.split(" "); //разбиваем по пробелу и пишем во временный массив
            for (String str : tmp) {  //идем по временному массиву и пытаемся превратить значение элемента массива в инт
                try {
                    list.add(Integer.parseInt(str));  //если получилось - добавили в лист
                } catch (Throwable ignore) {}  //не получилось? ну и хрен с ним, берем следующий элемент
            }
        }
        reader.close();

        System.out.println("array = " + list);
    }








    public static void main(String[] args) throws IOException {
        String s1 = "./src/testField/test.txt";
        String s2 = "./src/testField/test1.txt";

        TestField1.readFileAndWriteAnswerInNewFile(s1, s2);
    }
}