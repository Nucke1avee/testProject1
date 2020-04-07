package testField;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestField {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String testFilePath = "./src/testField/test.txt";

        String s = "wqeqw    -  qwe qweqwe - 123123 - --- 123 ----123555";
        s = s.replaceAll("[ -1]","");
        System.out.println(s);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(testFilePath));
            writer.write(Integer.toString(111111111));

            writer.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }






        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");


    }
}
