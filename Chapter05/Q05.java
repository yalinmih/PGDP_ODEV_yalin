package odevler.chapter02.Chapter05;

public class Q05 {
    public static void main(String[] args) {
        double kgToPound = 2.2;
        double poundToKg = 1 / kgToPound;
        System.out.println("Kilograms   Pounds     |   Pounds    Kilograms");

        int kg = 1;
        int pounds = 20;
        while (kg <= 199 && pounds <= 515) {
            double poundNew = kg * kgToPound;
            double kgConverted = pounds * poundToKg;

            System.out.printf("%-11d %-10.1f |   %-9d %.2f%n", kg, poundNew, pounds, kgConverted);

            kg += 2;
            pounds += 5;
        }
    }
}
