package odevler.chapter02.Chapter09;

import java.util.Scanner;

public class Location {
    public int row;
    public int col;
    public double maxValue;

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] array) {
        double maxValue = array[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return new Location(maxRow, maxCol, maxValue);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        System.out.print("Enter the array: ");
        double[][] array = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        Location loc = locateLargest(array);
        System.out.println("The location of the largest element is "
                + loc.maxValue + " at (" + loc.row + ", " + loc.col + ")");
    }
}
