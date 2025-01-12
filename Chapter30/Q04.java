package odevler.chapter02.Chapter30;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int numberOfDistinct = (int) Arrays.stream(numbers)
                .distinct()
                .count();
        System.out.println("The number of distinct number is " + numberOfDistinct);

        System.out.print("The distinct numbers are: ");
        Arrays.stream(numbers)
                .distinct()
                .forEach(number -> System.out.print(number + " "));
    }
}
