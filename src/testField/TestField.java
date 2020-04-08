package testField;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class TestField {
    public static void readerWriter(String in, String out) throws IOException {

        BufferedReader reader;
        BufferedWriter writer;
        try {
            reader = new BufferedReader(new FileReader(in));
            writer = new BufferedWriter(new FileWriter(out));
            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s + "\n");
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readerFromFileAndPrintToConsole(String path) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(path));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writerToFile(String path) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(path));
            writer.write("Shalom");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndAdditionAndWriteAnswer(String in, String out) {
        BufferedReader reader;
        BufferedWriter writer;
        String s;
        // ArrayList<Integer> list = new ArrayList<Integer>();

        try {
            int answer = 0;
            reader = new BufferedReader(new FileReader(in));
            writer = new BufferedWriter(new FileWriter(out));
            while ((s = reader.readLine()) != null) {
                answer = answer + Integer.parseInt(s);
            }
            System.out.println(answer + "");
            writer.write(Integer.toString(answer));
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileAndWriteAnswerInNewFile(String in, String out) {
        BufferedReader reader;
        BufferedWriter writer;
        String s;
        char[] charArray;
        String temp = "";
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> tempList = new ArrayList<String>();
        ArrayList<Integer> resList = new ArrayList<Integer>();
        int res = 0;
        char[] numbers = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        try {
            reader = new BufferedReader(new FileReader(in));
            writer = new BufferedWriter(new FileWriter(out));
            while (reader.ready()) { //все сроки из файла мы записываем в лист строк
                s = reader.readLine();
                System.out.println("s = " + s);
                list.add(s);
            }
            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            charArray = list.get(i).toCharArray(); //в масив чар добавляем строки по одной
            //System.out.println("char array = " + Arrays.toString(charArray));
            for (int j = 0; j < charArray.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    if (charArray[j] == numbers[k]) { // сравниваем символ из массива чар с массивом намберс
                        temp = temp + numbers[k]; // если символы равны то добавляем в стрингу темп
                        System.out.println("temp = " + temp);
                    } else if (charArray[j] == ' ') { // если символ чар равен ' '
                        if (!temp.equals("") && !temp.equals(" ")) { // и если строка немп не равна "" или " "
                            tempList.add(temp); // то добавляем это строку в новый лист

                            temp = ""; // здесь обнуляем строку
                        }
                    }
                }

            }
        }

        for (int i = 0; i < tempList.size(); i++) { // здесь выводим содержимое нового листа
            System.out.println(tempList.get(i));
        }

        System.out.println("array 111 = " + tempList);
    }

    public static void main(String[] args) throws IOException {
        String s1 = "./src/testField/test.txt";
        String s2 = "./src/testField/test1.txt";

        TestField.readFileAndWriteAnswerInNewFile(s1, s2);
    }
}