package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char c = input.next().charAt(0);

        if (c >= 65 && c <= 90) {
            System.out.println(c + " is a consonant");
        } else if (c >= 97 && c <= 122) {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is an invalid input");
        }
    }
}
