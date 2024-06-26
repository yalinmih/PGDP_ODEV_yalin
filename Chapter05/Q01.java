package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        int count = 0;
        int posCount = 0;
        int negCount = 0;
        double total = 0;

        while (number != 0) {
            count++;
            total += number;
            if (number > 0) {
                posCount++;
            } else {
                negCount++;
            }
            number = input.nextInt();
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + posCount);
            System.out.println("The number of negatives is " + negCount);
            System.out.println("The total is " + total);
            System.out.println("The average is " + (total / count));
        }
    }
}
