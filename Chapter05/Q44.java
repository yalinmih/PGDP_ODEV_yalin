package odevler.chapter02.Chapter05;

import java.util.Scanner;
//chatGPT yardımı ile
public class Q44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        StringBuilder binary = new StringBuilder();
        for (int i = 16; i > 0; i--) {
            int bit = (number >> i) & 1;
            binary.append(bit);
        }
        System.out.println(binary);
    }
}
