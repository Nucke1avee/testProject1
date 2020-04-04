package org.jakumo.euler.e013;

//Найдите первые десять цифр суммы следующих ста 50-значных чисел.
//см. файл littleNumbers.txt.txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Throwable {
        //Execution time = 9ms
        //Answer = 5537376230
        String path = "./src/org/jakumo/euler/e013/littleNumbers.txt";
        System.out.println(
                getBigSumFromArrayList(getBigIntegerArrayListFromFile(path))
                        .toString().substring(0, 10));
    }

    private static BigInteger getBigSumFromArrayList(ArrayList<BigInteger> bigIntegers) {
        BigInteger sum = BigInteger.valueOf(0);
        for (BigInteger num : bigIntegers) sum = sum.add(num);
        return sum;
    }

    private static ArrayList<BigInteger> getBigIntegerArrayListFromFile(String path) throws Throwable {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        ArrayList<BigInteger> bigIntegers = new ArrayList<>();

        while (bufferedReader.ready()) bigIntegers.add(new BigInteger(bufferedReader.readLine()));
        bufferedReader.close();

        return bigIntegers;
    }
}
