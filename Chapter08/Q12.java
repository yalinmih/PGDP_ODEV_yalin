package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};

        System.out.print(
                """
                        (0-single filer, 1-married jointly or qualifying widow(er), \

                        2-married separately, 3-head of household)
                        Enter the filing status:\s""");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = computeTax(brackets[status], rates, income);
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }

    public static double computeTax(int[] bracket, double[] rates, double income) {
        double tax;
        if (income <= bracket[0]) {
            tax = income * rates[0];
        } else {
            tax = bracket[0] * rates[0];
            for (int i = 1; i < bracket.length; i++) {
                if (income > bracket[i]) {
                    tax += (bracket[i] - bracket[i - 1]) * rates[i];
                } else {
                    tax += (income - bracket[i - 1]) * rates[i];
                    return tax;
                }
            }
            tax += (income - bracket[bracket.length - 1]) * rates[rates.length - 1];
        }
        return tax;
    }
}