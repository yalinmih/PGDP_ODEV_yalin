package odevler.chapter02.Chapter06;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        printMatrix(number);
    }
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                int num = (int) (Math.random() * 2);
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
