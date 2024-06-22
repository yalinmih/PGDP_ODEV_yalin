package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double average1 = price1 / weight1;
        double average2 = price2 / weight2;

        if (average1 > average2) {
            System.out.println("Package 2 has a better price.");
        } else if (average1 == average2) {
            System.out.println("Two packages have the same price.");
        } else {
            System.out.println("Package 1 has a better price.");
        }
    }
}
