package testField;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestField2 {
    public static void main(String[] args) {
        //кривой вариант
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, tmp = Integer.MAX_VALUE;

        try {
            min1 = Integer.parseInt(reader.readLine());
            while (true) {
                if (tmp < min1) {
                    min2 = min1;
                    min1 = tmp;
                }
                if (tmp > min1 && tmp < min2) {
                    min2 = tmp;
                }
                tmp = Integer.parseInt(reader.readLine());
            }
        } catch (Exception ignore) {
            if (min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) {
                System.out.println("слишком мало чисел!");
            } else System.out.println("min1 = " + min1 + "; min2 = " + min2);
        }
    }
}
