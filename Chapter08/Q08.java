package odevler.chapter02.Chapter08;

import java.util.Scanner;

//daha rahat nasıl yapılır sor !!

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int number = input.nextInt();

        double[][] points = new double[number][2];

        System.out.print("Enter " + number + " points: ");
        for (int i = 0; i < number; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = Double.MAX_VALUE;

        for (int i = 1; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));

                if (distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));

                if (distance == shortestDistance) {
                    System.out.println("The closest two points are (" + points[i][0] + ", " + points[i][1] +
                            ") and (" + points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }
}
