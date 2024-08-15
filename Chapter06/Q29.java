package odevler.chapter02.Chapter06;

public class Q29 {
    public static void main(String[] args) {
        for (int i = 2; i < 998; i++) {
            if (isTwinPrimes(i)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean isTwinPrimes(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        for (int i = 2; i <= Math.sqrt(number + 2); i++) {
            if ((number + 2) % i == 0) {
                return false;
            }
        }
        return true;
    }
}
