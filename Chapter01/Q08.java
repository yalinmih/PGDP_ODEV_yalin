package odevler.chapter02.Chapter01;

public class Q08 {
    public static void main(String[] args) {
        double r = 5.5;
        final double PI = Math.PI;

        double perimeter = 2 * r * PI;
        System.out.println(perimeter);

        double area = PI * Math.pow(r, 2);
        System.out.println(area);
    }
}
