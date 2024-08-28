package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100: ");
        int[] array = new int[100];

        while (true) {
            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            if (num > 0 && num < 101) {
                array[num - 1]++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println((i + 1) + " occurs " + array[i] + " times ");
            }
        }
    }
}
