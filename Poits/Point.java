package Poits;

public class Point {
    protected double x;
    protected double y;

    public Point(double x, double y) {
        set(x, y);
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point add(Point p) {
        return new Point(p.x + this.x, p.y + this.y);
    }

    public void setSum(Point p1, Point p2) {
        this.set(p1.x + p2.x, p1.y + p1.x);
    }

    public void setPoint(Point p) {
        this.set(p.x, p.y);
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x + p.x, 2) + Math.pow(this.y + p.y, 2));
    }

    public void set(double x, double y) {
        if (x > -2000.0 && x < 2000) {
            this.x = x;
        }
        if (y > -2000 && y < 2000) {
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
