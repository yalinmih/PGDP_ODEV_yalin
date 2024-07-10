package odevler.chapter02.Chapter05;
// 42. soruda do-while ile yap diyor
public class Q39 {
    public static void main(String[] args) {
        double baseSalary = 5000;
        double goalEarning = 30_000 - baseSalary;

        double salesAmount = 0.0;
        double earned;
        do {
            salesAmount += 1.0; // Increment sales amount by $1000

            if (salesAmount <= 5000) {
                earned = salesAmount * 0.08;
            } else if (salesAmount <= 10000) {
                earned = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
            } else {
                earned = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
            }

        } while (earned < goalEarning);

        System.out.println("The min amount: " + salesAmount);
    }
}
