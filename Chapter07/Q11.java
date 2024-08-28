package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double mean = mean(numbers);
        System.out.printf("The mean is %.2f%n", mean);

        double deviation = deviation(numbers);
        System.out.printf("The standard deviation is %.5f%n", deviation);
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (double i : x) {
            sum += i;
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double sum = 0;
        double mean = mean(x);
        for (double i : x) {
            sum += Math.pow(i - mean, 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }
}
