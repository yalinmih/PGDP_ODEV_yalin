package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println(isPalindrome(number));
    }
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;

        }
        return reversed;
    }
    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }
}
