package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        int distinctCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = input.nextInt();

            int j;
            for (j = 0; j < distinctCount; j++) {
                if (number == numbers[j]) {
                    break;
                }
            }

            if (j == distinctCount) {
                numbers[distinctCount] = number;
                distinctCount++;
            }
        }
        System.out.println("The number of distinct number is " + distinctCount);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

