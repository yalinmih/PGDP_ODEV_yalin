package odevler.chapter02.Chapter06;

public class Q13 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "i", "m(i)");
        System.out.println("-----------------------");

        for (int i = 1; i <= 20; i++) {
            double total = sumOfSeries(i);
            System.out.printf("%-15d%-15.4f\n", i, total);
        }
    }
    public static double sumOfSeries(int num) {
        double total = 0;
        for (int i = 1; i <= num; i++) {
            total += (double) i / (i+1);
        }
        return total;
    }
}
