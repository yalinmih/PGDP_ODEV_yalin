package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        String[] array = {"monkey", "rooster", "dog", "pig", "rat", "ox"
                , "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println("The animal is " + array[year % 12]);
    }
}
