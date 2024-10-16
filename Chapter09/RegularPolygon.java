package odevler.chapter02.Chapter09;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        RegularPolygon pol1 = new RegularPolygon();
        System.out.println("The perimeter: " + pol1.getPerimeter() + " and the are: " + pol1.getArea());

        RegularPolygon pol2 = new RegularPolygon(6, 4);
        System.out.println("The perimeter: " + pol2.getPerimeter() + " and the are: " + pol2.getArea());

        RegularPolygon pol3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The perimeter: " + pol3.getPerimeter() + " and the are: " + pol3.getArea());
    }
}
