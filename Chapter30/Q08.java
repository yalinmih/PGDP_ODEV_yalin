package odevler.chapter02.Chapter30;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("The distinct numbers are: ");
        Arrays.stream(array)
                .distinct()
                .forEach(number -> System.out.print(number + " "));
    }
}
