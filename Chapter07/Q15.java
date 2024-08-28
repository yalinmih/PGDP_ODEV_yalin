package odevler.chapter02.Chapter07;

//chatgpt yardımı ile

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int[] res = eliminateDuplicates(array);
        System.out.print("The distinct numbers are: ");

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int size = 0;

        for (int i : list) {
            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {
                if (i == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[size++] = i;
            }
        }

        int[] result = new int[size];
        System.arraycopy(temp, 0, result, 0, size);
        return result;
    }
}
