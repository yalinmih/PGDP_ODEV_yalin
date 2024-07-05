package odevler.chapter02.Chapter05;

public class Q25 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double pi = 0.0;
            for (int k = 1; k <= i; k++) {
                pi += Math.pow(-1, k + 1) / (2 * k - 1);
            }
            System.out.println(i + ":   " + pi * 4);
        }
    }
}
