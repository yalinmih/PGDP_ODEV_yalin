package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the edges: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if (isValid(edge1, edge2, edge3)) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("Invalid.");
        }
    }
    public static boolean isValid(double edge1, double edge2, double edge3) {
        return (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
    }
}

