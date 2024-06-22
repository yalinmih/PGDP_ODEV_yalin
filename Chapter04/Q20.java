package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = input.nextLine();

        System.out.println(s.length());
        System.out.println(s.charAt(0));
    }
}
