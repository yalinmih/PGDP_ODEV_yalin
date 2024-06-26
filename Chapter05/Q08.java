package odevler.chapter02.Chapter05;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int students = input.nextInt();
        input.nextLine();

        double highest = -1;
        String best = "";

        int count = 0;
        while (count < students) {
            System.out.print("Name of the student: ");
            String name = input.nextLine();

            System.out.print("Score of the student: ");
            double score = input.nextDouble();
            input.nextLine();

            if (score > highest) {
                highest = score;
                best = name;
            }
            count++;
        }
        System.out.println(best + " is the highest.");
    }
}

