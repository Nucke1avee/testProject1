package testField;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestField {
    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        reader.close();

        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();
        int maxLengthPosition = 0;
        int minLengthPosition = 0;
        //нафиг лишние переменные =)

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                maxLengthPosition = i;
            }
            if (list.get(i).length() < minLength) {
                minLength = list.get(i).length();
                minLengthPosition = i;
            }
        }
        if (maxLengthPosition < minLengthPosition) {
            System.out.println(list.get(maxLengthPosition)); //тут тянем просто строку из листа с нужным нам индексом
        } else {
            System.out.println(list.get(minLengthPosition)); //ну и тут, соответственно
        }
    }
}
