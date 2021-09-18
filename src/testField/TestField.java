package testField;



public class TestField {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String testFilePath = "./src/testField/test.txt";

        System.out.println(myAtoi("qwe   -411213213213293 with words"));


        System.out.println("\nExecution time: " + (System.currentTimeMillis() - startTime) + " ms");
    }



    public static int myAtoi(String s) {
        String[] str = s.trim().split(" ");
        try {
            return Integer.parseInt(str[0]);
        } catch (Exception e) {}
        return 0;
    }

}