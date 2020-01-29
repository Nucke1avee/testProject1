package testField;

public class TestField {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int i = 900009;
        char[] s = Integer.toString(i).toCharArray();

        for (int j = 0, k = s.length - 1; j < s.length / 2; j++, k--) {
            System.out.println("pair: j = " + s[j] + " k = " + s[k]);
            if (s[j] != s[k]) break;
            System.out.println("ololololo");
        }

        for (char c : s) {
            System.out.println(c);
        }


        //System.out.println(s.length);






        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");
    }
}
