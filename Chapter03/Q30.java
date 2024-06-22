package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q30 {
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

        String period = (currentHour >= 12) ? " PM" : " AM";
        currentHour = currentHour % 12;
        if (currentHour == 0) {
            currentHour = 12;
        }

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + period);
    }
}
