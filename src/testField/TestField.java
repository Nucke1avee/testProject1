package testField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestField {
    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        String s = "wqeqw    -  qwe qweqwe - 123123 - --- 123 ----123555";
        s = s.replaceAll("[ -1]","");
        System.out.println(s);




        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");


    }
}
