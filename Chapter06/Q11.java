package odevler.chapter02.Chapter06;

public class Q11 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Sales Amount", "Commission");
        System.out.println("-----------------------");

        for (double amount = 10000; amount <= 100000; amount += 5000) {
            double commission = computeCommission(amount);
            System.out.printf("%-15.0f%-15.1f\n", amount, commission);
        }

    }
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
        } else {
            commission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
        }
        return commission;
    }
}
