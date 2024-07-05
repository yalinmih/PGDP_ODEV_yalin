package odevler.chapter02.Chapter05;

public class Q24 {
    public static void main(String[] args) {
        double total = 0.0;
        for (int i = 1, p = 3; i <= 97; i++, p++) {
            total += (double) i / p;
        }
        System.out.println(total);
    }
}
