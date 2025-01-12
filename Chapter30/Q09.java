package odevler.chapter02.Chapter30;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int num = input.nextInt();
        input.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = input.nextLine();
            System.out.print("Enter score of student " + (i + 1) + ": ");
            int score = input.nextInt();
            input.nextLine();

            students.add(new Student(name, score));
        }

        students.stream()
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .forEach(System.out::println);
    }

    static class Student {
        private final String name;
        private final int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return name + " (" + score + ")";
        }
    }
}