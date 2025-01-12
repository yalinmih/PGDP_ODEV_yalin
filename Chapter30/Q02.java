package odevler.chapter02.Chapter30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100: ");
        List<Integer> list = new ArrayList<>();

        while (true) {
            int num = input.nextInt();

            if (num == 0) break;

            if (num > 0 && num < 101) {
                list.add(num);
            }
        }

        list.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .forEach((num, count) -> {
                    String timeOrTimes = count == 1 ? "time" : "times";
                    System.out.println(num + " occurs " + count + " " + timeOrTimes);
                });
    }
}
