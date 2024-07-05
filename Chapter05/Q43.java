package odevler.chapter02.Chapter05;

public class Q43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int p = 2; p <= 7; p++) {
                if (p > i) {
                    System.out.println(i + "  " + p);
                    count++;
                }
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
