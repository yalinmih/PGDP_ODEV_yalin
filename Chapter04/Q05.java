package odevler.chapter02.Chapter04;

import java.util.Scanner;

// kitapta cevap anahtarindaki 74.69 yanlis

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int number = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (number * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / number));

        System.out.println("The area of the polygon is " + area);
    }
}
