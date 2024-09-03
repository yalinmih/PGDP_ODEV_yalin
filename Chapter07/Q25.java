package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] eqn = {a, b, c};
        double[] roots = new double[2];

        int num = solveQuadratic(eqn, roots);
        System.out.println("Number of roots: " + num);

        if (num > 0) {
            System.out.print("The root(s) are ");
            for (int i = 0; i < num; i++) {
                System.out.print(roots[i] + " ");
            }
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }
}
