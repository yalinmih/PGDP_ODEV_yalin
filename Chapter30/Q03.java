package odevler.chapter02.Chapter30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter unspecified number of scores: ");
        List<Integer> scores = new ArrayList<>();

        while (true) {
            int score = input.nextInt();

            if (score < 0) {
                break;
            }
            if (scores.size() >= 100) {
                System.out.println("Maximum number of scores reached.");
                break;
            }
            scores.add(score);
        }

        if (scores.isEmpty()) {
            System.out.println("There is no score to analyse.");
            return;
        }

        double average = scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        long countBelow = scores.stream()
                .filter(score -> score < average)
                .count();

        long countAbove = scores.size() - countBelow;

        System.out.println(countAbove + " scores above or equal to the average");
        System.out.println(countBelow + " scores below the average");
    }
}
