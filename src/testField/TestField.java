package testField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestField {
    public static void main(String[] args) throws Throwable {
        long startTime = System.currentTimeMillis();

        int orderNumber = 999999;
//        long result = getTriangleNumberByOrder(orderNumber);
        long result = getNextTriangleNumber();
        System.out.println(result);

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");


    }



    private static long getTriangleNumberByOrder(int orderNumber) {
        long triangleNumber = 0;
        for (int i = 0; i <= orderNumber; i++) {
            triangleNumber += i;
        }
        return triangleNumber;
    }

    private static long trNum = 99999494645616165L;
    private static long trNumCounter = 15195951951616L;

    private static long getNextTriangleNumber() {
        return trNum += ++trNumCounter;
    }
}
