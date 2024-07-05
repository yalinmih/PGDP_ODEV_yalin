package odevler.chapter02.Chapter05;

public class Q23 {
    public static void main(String[] args) {
        double total = 0.0;
        for (int n = 1; n < 50000; n++) {
            total += (double) 1 / n;
        }
        System.out.println(total);
    }
}
