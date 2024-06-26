package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int students = input.nextInt();
        input.nextLine();

        double highest = -1;
        String best = "";

        double highest2 = -1;
        String best2 = "";

        int count = 0;
        while (count < students) {
            System.out.print("Name of the student: ");
            String name = input.nextLine();

            System.out.print("Score of the student: ");
            double score = input.nextDouble();
            input.nextLine();

            if (score > highest) {
                highest2 = highest;
                best2 = best;
                highest = score;
                best = name;
            } else if (score > highest2) {
                highest2 = score;
                best2 = name;
            }
            count++;
        }
        System.out.println(best + " is the highest.");
        System.out.println(best2 + " is the second");
    }
}
