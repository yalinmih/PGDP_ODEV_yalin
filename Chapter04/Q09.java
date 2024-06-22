package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);

        System.out.println("The Unicode for the character " + c + " is " + (int) c);
    }
}
