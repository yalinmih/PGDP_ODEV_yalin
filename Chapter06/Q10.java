package odevler.chapter02.Chapter06;

// her 10 tanede sıra atlamayı ben ekledim

public class Q10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + "  ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
