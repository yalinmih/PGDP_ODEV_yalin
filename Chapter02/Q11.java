package odevler.chapter02.Chapter02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312_032_486;
        double totalSeconds = 365 * 24 * 60 * 60;
        double birth = totalSeconds / 7;
        double death = totalSeconds / 13;
        double immigrant = totalSeconds / 45;
        double changeYear = birth - death + immigrant;

        int totalPopulation = (int) (population + (changeYear * years));
        System.out.println("The population in " + years + " years is " + totalPopulation);
    }
}
