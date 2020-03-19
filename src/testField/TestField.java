package testField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestField {
    public static void main(String[] args) throws Throwable {
        long num = 113383;

        while (num != 1) {
            System.out.println(num);
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }

        }



    }
}
