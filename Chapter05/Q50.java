package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        System.out.println("The number of uppercase letters is " + count);
    }
}
