package testField;

public class TestField {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();


        String a ="0000001";
        System.out.println(a);
        int b = Integer.parseInt(a);
        System.out.println(b);


        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");
    }


    private static boolean isSimple(int i) {
        if (i < 2) return false;
        for (int j = 1, count = 0; j <= Math.sqrt(i); j++) {
            if (i % j == 0) count++;
            if (count > 1) return false;
        }
        return true;
    }



}
