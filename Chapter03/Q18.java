package odevler.chapter02.Chapter03;

import java.util.Scanner;

// 50yi 20 yaptim

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();

        double cost = 0;
        if (weight <= 1) {
            cost = 3.5;
        } else if (weight > 1 && weight <= 3) {
            cost = 5.5;
        } else if (weight > 3 && weight <= 10) {
            cost = 8.5;
        } else if (weight > 10 && weight <= 20){
            cost = 10.5;
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped");
        }
        System.out.println("The shipping cost is " + cost);
    }
}
