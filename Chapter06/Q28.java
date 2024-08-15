package odevler.chapter02.Chapter06;

//Math.sqrt kısmında chatgt

public class Q28 {
    public static void main(String[] args) {
        System.out.printf("%-15s%s", "p", "2^p-1");
        System.out.println("\n--------------------");

        for (int p = 2; p <= 31; p++) {
            int result = (int) (Math.pow(2, p) - 1);
            if (isMersennePrime(result)) {
                System.out.printf("%-15d%d", p, result);
                System.out.println();
            }
        }
    }

    public static boolean isMersennePrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

