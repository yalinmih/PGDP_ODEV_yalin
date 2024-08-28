package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter unspecified number of scores: ");
        int[] scores = new int[100];
        int count = 0;

        while (true) {
            int score = input.nextInt();

            if (score < 0) {
                break;
            }
            if (count < 100) {
                scores[count++] = score;
            } else {
                System.out.println("Maximum number of scores reached.");
                break;
            }
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (count == 0) ? 0 : (double) sum / count;

        int countAbove = 0;
        int countBelow = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                countAbove++;
            } else {
                countBelow++;
            }
        }

        System.out.println(countAbove + " scores above");
        System.out.println(countBelow + " scores below");
    }
}
