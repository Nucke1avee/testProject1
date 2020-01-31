package testField;

public class TestField {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();


        System.out.println(isSimple(101));
        System.out.println(isSimple(11));
        System.out.println(isSimple(356));
        System.out.println(isSimple(19));
        System.out.println(isSimple(33333));
        System.out.println(isSimple(183));


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
