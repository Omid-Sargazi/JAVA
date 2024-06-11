package Poits;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public double perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    @Override
    public String toString() {
        return "Triangle(" + a + ", " + b + ", " + c + ")";
    }
}
