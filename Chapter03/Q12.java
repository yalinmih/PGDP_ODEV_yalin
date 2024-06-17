package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is palindrome");
        } else {
            System.out.println(number + " is not palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int givenNumber = number;
        int reversed = 0;

        while(number != 0) {
            int temp = number % 10;
            reversed = reversed * 10 + temp;
            number /= 10;
        }
        return reversed == givenNumber;
    }
}
