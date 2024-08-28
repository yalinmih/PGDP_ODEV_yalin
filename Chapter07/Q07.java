package odevler.chapter02.Chapter07;

public class Q07 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 10);
            array[random]++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number of " + i + " is " + array[i]);
        }
    }
}
