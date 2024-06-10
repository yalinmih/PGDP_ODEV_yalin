package odevler.chapter02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int min = input.nextInt();

        int year = min / (60 * 24 * 365);
        int day = (min / (60 * 24)) % 365;

        System.out.println(min + " minutes is approximately " + year + " years and " + day + " days");
    }
}
