package odevler.chapter02.Chapter06;

public class Q14 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "i", "m(i)");
        System.out.println("-----------------------");

        for (int i = 1; i <= 901; i += 100) {
            double sum = findPI(i);
            System.out.printf("%-15d%-15.4f\n", i, sum);
        }

    }
    public static double findPI(int num) {
        double total = 0;
        for (int k = 0; k < num; k++) {
            total += Math.pow(-1, k) / (2 * k + 1);
        }
        return 4 * total;
    }
}
