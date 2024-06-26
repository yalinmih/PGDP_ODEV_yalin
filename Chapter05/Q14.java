package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two different integer values: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int gcd = 1;
        int i = 2;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("The greatest common divisor is: " + gcd);
    }
}
