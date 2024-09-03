package odevler.chapter02.Chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];

        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] result = merge(list1, list2);
        Arrays.sort(result);
        System.out.print("The merged list is ");

        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, result, 0, list1.length);
        System.arraycopy(list2, 0, result, list1.length, list2.length);

        return result;
    }
}