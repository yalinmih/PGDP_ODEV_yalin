package odevler.chapter02.Chapter06;

public class Q08 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Celsius", "Fahrenheit");
        System.out.println("-----------------------");

        for (double celsius = 40.0; celsius >= 31; celsius--) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%-15.1f%-15.1f\n", celsius, fahrenheit);
        }

        System.out.println();
        System.out.printf("%-15s%-15s\n", "Fahrenheit", "Celsius");
        System.out.println("-----------------------");

        for (double fahrenheit = 120.0; fahrenheit >= 30; fahrenheit -= 10) {
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%-15.1f%-15.1f\n", fahrenheit, celsius);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
