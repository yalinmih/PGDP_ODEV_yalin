package odevler.chapter02.Chapter04;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double angle1 = Math.toRadians(90);
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);

        double angle2 = Math.toRadians(90 + 72);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);

        double angle3 = Math.toRadians(90 + 2 * 72);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double angle4 = Math.toRadians(90 + 3 * 72);
        double x4 = radius * Math.cos(angle4);
        double y4 = radius * Math.sin(angle4);

        double angle5 = Math.toRadians(90 + 4 * 72);
        double x5 = radius * Math.cos(angle5);
        double y5 = radius * Math.sin(angle5);

        String formattedY1 = String.format("%.4f", y1);
        String formattedX2 = String.format("%.4f", x2);
        String formattedY2 = String.format("%.4f", y2);
        String formattedX3 = String.format("%.4f", x3);
        String formattedY3 = String.format("%.4f", y3);
        String formattedX4 = String.format("%.4f", x4);
        String formattedY4 = String.format("%.4f", y4);
        String formattedX5 = String.format("%.4f", x5);
        String formattedY5 = String.format("%.4f", y5);


        System.out.println("The coordinates of five points on the pentagon are\n" +
                "(" + formattedX5 + ", " + formattedY5 + ")\n" +
                "(" + x1 + ", " + formattedY1 + ")\n" +
                "(" + formattedX2 + ", " + formattedY2 + ")\n" +
                "(" + formattedX3 + ", " + formattedY3 + ")\n" +
                "(" + formattedX4 + ", " + formattedY4 + ")");
    }
}
