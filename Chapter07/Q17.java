package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int num = input.nextInt();

        String[] names = new String[num];
        int[] scores = new int[num];

        input.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        for (int i = 0; i < num; i++) {
            System.out.print("Enter score of student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        sort(num, scores, names);
        for (int i = 0; i < num; i++) {
            System.out.print(names[i] + " ");
        }
    }
    public static void sort(int num, int[] scores, String[] names) {
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}
