package odevler.chapter02.Chapter10;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint mp) {
        return Math.sqrt(Math.pow(this.x - mp.getX(), 2) + Math.pow(this.y - mp.getY(), 2));
    }

    public double distance(double otherX, double otherY) {
        return Math.sqrt(Math.pow(this.x - otherX, 2) + Math.pow(this.y - otherY, 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        double distance1 = point1.distance(point2);
        double distance2 = point1.distance(10, 30.5);

        System.out.println(distance1);
        System.out.println(distance2);
    }
}
