package odevler.chapter02.Chapter07;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }


    }
    public static int partition(int[] list) {
        return 0;
    }
}
