package odevler.chapter02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long milliSeconds = System.currentTimeMillis();
        long totalSeconds = milliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes =  totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


    }
}
