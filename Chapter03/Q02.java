package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        if (number1 + number2 + number3 == answer) {
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is true ");
        }
        else {
            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is false ");
        }
    }
}
