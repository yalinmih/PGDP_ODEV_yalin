package odevler.chapter02;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acc = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acc);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
