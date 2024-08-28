package odevler.chapter02.Chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 double numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int p = array.length - 2; p >= i; p--) {
                if (array[p] > array[p + 1]) {
                    double x = array[p];
                    array[p] = array[p + 1];
                    array[p + 1] = x;
                }
            }
        }
    }
}

