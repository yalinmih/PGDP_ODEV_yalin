package odevler.chapter02.Chapter30;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q16 {
    public static void main(String[] args) {
        double[][][] scores = {
                {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
                {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
                {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
                {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
                {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
                {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}
        };

        String result = Arrays.stream(scores)
                .flatMap(Arrays::stream) // Flatten one level
                .flatMapToDouble(Arrays::stream) // Flatten to DoubleStream
                .distinct() // Remove duplicates
                .sorted() // Sort in natural order
                .mapToObj(Double::toString) // Convert doubles to strings for joining
                .collect(Collectors.joining(" ")); // Join all strings with a space

        // Print the results, ensuring five numbers per line
        String[] splitResult = result.split(" ");
        for (int i = 0; i < splitResult.length; i++) {
            System.out.print(splitResult[i] + " ");
            if ((i + 1) % 5 == 0) { // Every five elements, break the line
                System.out.println();
            }
        }
        if (splitResult.length % 5 != 0) { // Add a newline if the last line isn't full
            System.out.println();
        }
    }
}
