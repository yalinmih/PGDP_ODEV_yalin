package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = input.nextInt();

        int[] array = new int[num];

        System.out.print("Enter " + num + " scores: ");
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }
        int bestScore = 0;
        for (int i = 0; i < num; i++) {
            if (array[i] > bestScore) {
                bestScore = array[i];
            }
        }
        for (int i = 0; i < num; i++) {
            if (array[i] >= bestScore - 10) {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is A");
            } else if (array[i] >= bestScore - 20) {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is B");
            } else if (array[i] >= bestScore - 30) {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is C");
            } else if (array[i] >= bestScore - 40) {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + array[i] + " and grade is F");
            }
        }
    }
}
