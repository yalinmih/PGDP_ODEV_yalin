package odevler.chapter02.Chapter05;

public class Q03 {
    public static void main(String[] args) {
        System.out.println("Kilograms         Pounds");

        int kg = 1;
        while (kg < 200) {
            double pound = kg * 2.2;
            String formattedPound = String.format("%.1f", pound);
            System.out.println(kg + "                 " + formattedPound);
            kg += 2;
        }
    }
}
