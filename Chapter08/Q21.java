package odevler.chapter02.Chapter08;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int num = input.nextInt();

        double[][] cities = new double[num][2];

        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[0].length; j++) {
                cities[i][j] = input.nextDouble();
            }
        }
        double minDistance = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < cities.length; i++) {
            double distanceTotal = 0;
            for (int j = 0; j < cities.length; j++) {
                distanceTotal += distance(cities[i], cities[j]);
            }
            if (distanceTotal < minDistance) {
                minIndex = i;
                minDistance = distanceTotal;
            }
        }

        System.out.println("The central city is at (" + cities[minIndex][0] + ", " + cities[minIndex][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f\n", minDistance);
    }

    public static double distance(double[] city1, double[] city2) {
        double xDistance = city1[0] - city2[0];
        double yDistance = city1[1] - city2[1];
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }
}
