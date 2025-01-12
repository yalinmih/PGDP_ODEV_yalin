package odevler.chapter02.Chapter30;

import java.util.Arrays;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double min = Arrays.stream(numbers).min().orElse(Double.NaN);
        System.out.println("The minimum number is " + min);
    }
}
