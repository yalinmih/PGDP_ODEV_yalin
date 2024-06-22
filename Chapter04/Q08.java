package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        char ascii = (char) code;

        System.out.println("The character for ASCII code " + code + " is " + ascii);
    }
}
