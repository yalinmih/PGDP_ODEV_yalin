package odevler.chapter02.Chapter05;

import java.util.Scanner;
// array kullanmadan nasıl daha kolay yapılır sor !!
public class Q45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        double number5 = input.nextDouble();
        double number6 = input.nextDouble();
        double number7 = input.nextDouble();
        double number8 = input.nextDouble();
        double number9 = input.nextDouble();
        double number10 = input.nextDouble();

        double sum = number1 + number2 + number3 + number4 + number5
                + number6 + number7 + number8 + number9 + number10;
        double mean = sum / 10;

        double part1 = Math.pow(number1, 2) + Math.pow(number2, 2) + Math.pow(number3, 2) +
                Math.pow(number4, 2) + Math.pow(number5, 2) + Math.pow(number6, 2) + Math.pow(number7, 2)
                + Math.pow(number8, 2) + Math.pow(number9, 2) + Math.pow(number10, 2);

        double part2 = Math.pow(sum, 2) / 10;

        double deviation = Math.sqrt((part1 - part2) / 9);

        System.out.printf("The mean is %.2f%n", mean);
        System.out.printf("The standard deviation is %.5f%n", deviation);
    }
}
