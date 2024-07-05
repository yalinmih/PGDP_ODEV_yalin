package odevler.chapter02.Chapter05;

import java.util.Scanner;

//chatGPT yardımı ile
public class Q37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        if (decimal == 0) {
            System.out.println("Binary value: 0");
        } else {
            StringBuilder binary = new StringBuilder();

            while (decimal > 0) {
                int remainder = decimal % 2;

                binary.insert(0, remainder);

                decimal = decimal / 2;
            }

            System.out.println("Binary value: " + binary);
        }
    }
}
