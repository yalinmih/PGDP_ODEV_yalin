package odevler.chapter02.Chapter07;

//binary her zaman 0 ms cikiyor, linear 1 ms de cikabiliyor

import java.util.Arrays;
import java.util.Random;

public class Q16 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(array.length);
        }

        int key = random.nextInt(array.length);

        long startLinear = System.currentTimeMillis();
        int res1 = linearSearch(array, key);
        long endLinear = System.currentTimeMillis();
        System.out.println("Linear search time: " + (endLinear - startLinear) + "ms");
        System.out.println("Key is " + res1);

        Arrays.sort(array);

        long startBinary = System.currentTimeMillis();
        int res2 = binarySearch(array, key);
        long endBinary = System.currentTimeMillis();
        System.out.println("Binary search time: " + (endBinary - startBinary) + "ms");
        System.out.println("Key is " + res2);
    }
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

