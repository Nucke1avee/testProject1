package useful;

public class PrimeCheck {
    //true - число простое, false - нет
    public static boolean isPrime(int i) {
        if (i < 2) return false;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
