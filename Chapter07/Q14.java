package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int gcd = gcd(numbers);
        System.out.println("Gcd is " + gcd);

    }

    public static int gcd(int... numbers) {
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = gcd(gcd, numbers[i]);
        }

        return gcd;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
