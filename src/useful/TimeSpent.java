package useful;

public class TimeSpent {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //your code

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("\nExecution time: " + timeSpent + " ms");
    }
}
