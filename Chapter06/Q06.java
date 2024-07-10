package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        displayPattern(number);
    }
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int p = n - i; p >= 1; p--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
