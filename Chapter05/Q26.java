package odevler.chapter02.Chapter05;

public class Q26 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double e = 0.0;
            double fac = 1.0;
            for (int k = 0; k <= i; k++) {
                if (k > 0) {
                    fac *= k;
                }
                e += 1 / fac;
            }
            System.out.println(i + ":   " + e);
        }
    }
}
