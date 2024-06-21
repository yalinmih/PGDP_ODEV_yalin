package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean divisible5and6 = (number % 5 == 0) && (number % 6 == 0);
        boolean divisible5or6 = (number % 5 == 0) || (number % 6 == 0);
        boolean divisible5xOr6 = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + divisible5and6);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisible5or6);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisible5xOr6);
    }
}
