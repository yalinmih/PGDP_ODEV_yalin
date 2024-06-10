package odevler.chapter02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        double interestRate = 0.05 / 12;

        double month1 = saving * (1 + interestRate);
        double month2 = (month1 + saving) * (1 + interestRate);
        double month3 = (month2 + saving) * (1 + interestRate);
        double month4 = (month3 + saving) * (1 + interestRate);
        double month5 = (month4 + saving) * (1 + interestRate);
        double month6 = (month5 + saving) * (1 + interestRate);

        System.out.println("After the sixth month, the account value is " + month6);
    }
}
