package odevler.chapter02.Chapter06;

public class Q09 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Feet", "Meters");
        System.out.println("-----------------------");

        for (double feet = 1.0; feet <= 10.0; feet += 1) {
            double meter = footToMeter(feet);
            System.out.printf("%-15.1f%-15.3f\n", feet, meter);
        }

        System.out.println();
        System.out.printf("%-15s%-15s\n", "Meters", "Feet");
        System.out.println("-----------------------");

        for (double meter = 20.0; meter <= 65.0; meter += 5) {
            double feet = meterToFoot(meter);
            System.out.printf("%-15.1f%-15.3f\n", meter, feet);
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
