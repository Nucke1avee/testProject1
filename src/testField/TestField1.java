package testField;

import java.io.*;
import java.util.ArrayList;


public class TestField1 {





    public static void readFileAndWriteAnswerInNewFile(String in, String out) throws IOException {
        BufferedReader reader;
        String s = "";
        String[] tmp;

        ArrayList<Integer> list = new ArrayList<>();

        reader = new BufferedReader(new FileReader(in));
        while (reader.ready()) {
            s = reader.readLine().replaceAll("[a-zA-Z]", "");
            tmp = s.split(" ");

            for (String str : tmp) {
                try {
                    list.add(Integer.parseInt(str));
                } catch (Throwable ignore) {}
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