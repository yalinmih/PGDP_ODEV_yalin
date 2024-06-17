package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        int speed = input.nextInt();

        if (isValid(temp, speed)) {
            double windIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) +
                    (0.4275 * temp * Math.pow(speed,0.16));
            System.out.println("The wind chill index is " + windIndex);
        } else {
            System.out.println("Invalid.");
        }
    }
    public static boolean isValid(double temp, int speed) {
        return (temp >= -58 && temp <= 41) && (speed >= 2);
    }
}
