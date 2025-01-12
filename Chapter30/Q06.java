package odevler.chapter02.Chapter30;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 double values: ");
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        double average = Arrays.stream(array).average().orElse(Double.NaN);
        System.out.println("The average is " + average);
    }
}
