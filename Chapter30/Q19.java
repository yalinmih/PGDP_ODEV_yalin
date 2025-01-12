package odevler.chapter02.Chapter30;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.io.IOException;

public class Q19 {
    public static void main(String[] args) {
        String filePath = "test.txt"; // Path to the file

        try {
            DoubleSummaryStatistics stats = Files.lines(Paths.get(filePath)) // Stream lines from the file
                    .flatMap(line -> Arrays.stream(line.trim().split("\\s+"))) // Split each line into words based on whitespace
                    .mapToDouble(Double::parseDouble) // Convert each piece to a double
                    .summaryStatistics(); // Get statistics

            System.out.println("Sum: " + stats.getSum());
            System.out.println("Average: " + stats.getAverage());
            System.out.println("Max: " + stats.getMax());
            System.out.println("Min: " + stats.getMin());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing a number from the file: " + e.getMessage());
        }
    }
}

