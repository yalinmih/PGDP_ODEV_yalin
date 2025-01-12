package odevler.chapter02.Chapter30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

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

        int bestScore = Arrays.stream(array).max().getAsInt();

        IntStream.range(0, array.length).forEach(i -> {
            char grade;
            int score = array[i];
            if (score >= bestScore - 10) {
                grade = 'A';
            } else if (score >= bestScore - 20) {
                grade = 'B';
            } else if (score >= bestScore - 30) {
                grade = 'C';
            } else if (score >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + score + " and grade is " + grade);
        });
    }
}
