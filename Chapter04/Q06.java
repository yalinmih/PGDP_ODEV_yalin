package odevler.chapter02.Chapter04;

public class Q06 {
    public static void main(String[] args) {
        final double radius = 40;

        double angle1 = Math.random() * (2 * Math.PI);
        double angle2 = Math.random() * (2 * Math.PI);
        double angle3 = Math.random() * (2 * Math.PI);

        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double d2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double d3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double angleA = Math.toDegrees(Math.acos((d1 * d1 - d2 * d2 - d3 * d3) / (-2 * d2 * d3)));

        double angleB = Math.toDegrees(Math.acos((d2 * d2 - d1 * d1 - d3 * d3) / (-2 * d1 * d3)));

        double angleC = Math.toDegrees(Math.acos((d3 * d3 - d2 * d2 - d1 * d1) / (-2 * d1 * d2)));

        System.out.println("Three angles in a triangle: " + angleA + " and " + angleB + " and " + angleC);
    }
}
