package odevler.chapter02.Chapter07;

public class Q13 {
    public static void main(String[] args) {
        System.out.println(getRandom(3, 5, 7));
    }
    public static int getRandom(int... numbers) {
        int random;

        while (true) {
            random = (int) (Math.random() * 54 + 1);
            for (int i : numbers) {
                if (i != random) {
                    return random;
                }
            }
        }
    }
}
