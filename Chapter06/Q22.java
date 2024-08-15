package odevler.chapter02.Chapter06;

public class Q22 {
    public static void main(String[] args) {
        double result = sqrt(100);
        System.out.println(result);
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        while (nextGuess - lastGuess >= 0.0001 || lastGuess - nextGuess >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}
