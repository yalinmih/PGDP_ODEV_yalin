package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int temp;
        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number1 > number3) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.println(number1 + " " + number2 + " " +  number3);
    }
}
