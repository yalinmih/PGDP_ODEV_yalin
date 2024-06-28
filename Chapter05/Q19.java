package odevler.chapter02.Chapter05;

public class Q19 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int p = 7; p > i; p--) {
                System.out.print("    ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.printf("%3d ", (int) Math.pow(2, k));
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.printf("%3d ", (int) Math.pow(2, l));
            }
            System.out.println();
        }
    }
}

