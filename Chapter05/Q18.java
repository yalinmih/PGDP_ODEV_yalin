package odevler.chapter02.Chapter05;

public class Q18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 2; i <= 7; i++) {
            for (int p = 1; p < i; p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.println("\n---------------");

        System.out.println("Pattern B");
        for (int i = 7; i >= 2; i--) {
            for (int p = 1; p < i; p++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.println("\n---------------");

        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int p = 6 - i; p >= 1; p--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("\n---------------");

        System.out.println("Pattern D");
        for (int i = 0; i < 6; i++) {
            for (int p = 0; p < i; p++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 6 - i; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }

    }
}

