package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 double numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);

        for (double i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
}

