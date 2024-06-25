package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federal = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();

        double grossPay = (10 * payRate);
        double federalW = grossPay * federal;
        double stateW = grossPay * state;
        double deduction = stateW + federalW;

        System.out.println("\nEmployee Name: " + name +
                "\nHours Worked: " + (double) hours +
                "\nPay Rate: $" + payRate +
                "\nGross Pay: $" + grossPay +
                "\nDeductions: " +
                "\n    Federal Withholding (" + (federal * 100) + "%): $" + federalW +
                "\n    State Withholding (" + (state * 100) + "%): $" + stateW +
                "\n    Total Deduction: $" + deduction +
                "\nNet Pay: $" + (grossPay - deduction));
    }
}
