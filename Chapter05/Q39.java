package odevler.chapter02.Chapter05;

public class Q39 {
    public static void main(String[] args) {
        double money = (5000 * 0.08) + (5000 * 0.1);
        double goal = 25_000 - money;

        double min = goal / 0.12;
        System.out.printf("%.2f", min + 10000);
    }
}
