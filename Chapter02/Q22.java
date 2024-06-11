package odevler.chapter02.Chapter02;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        int amount = input.nextInt();

        double numberNew = (double) amount / 100;
        System.out.println(numberNew);
    }
}
