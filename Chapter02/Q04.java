package odevler.chapter02.Chapter02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();

        double kg = pound * 0.454;
        System.out.println(pound + " pounds is " + kg + " kilograms");
    }
}
