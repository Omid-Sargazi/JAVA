package filesProject;

import java.util.ArrayList;
import java.util.List;

public class Point02 {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    public Point subtract(Point other) {
        return new Point(this.x - other.x, this.y - other.y);
    }

    public Point multiply(Point other) {
        return new Point(this.x * other.x, this.y * other.y);
    }

    public Point divide(Point other) {
        return new Point(this.x / other.x, this.y / other.y);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class Point3D extends Point {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double distance(Point other) {
        if (other instanceof Point3D) {
            Point3D o = (Point3D) other;
            return Math.sqrt(Math.pow(this.x - o.x, 2) + Math.pow(this.y - o.y, 2) + Math.pow(this.z - o.z, 2));
        }
        return super.distance(other);
    }

    public Point3D add(Point3D other) {
        return new Point3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Point3D subtract(Point3D other) {
        return new Point3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Point3D multiply(Point3D other) {
        return new Point3D(this.x * other.x, this.y * other.y, this.z * other.z);
    }

    public Point3D divide(Point3D other) {
        return new Point3D(this.x / other.x, this.y / other.y, this.z / other.z);
    }

    @Override
    public String toString() {
        return "Point3D(" + x + ", " + y + ", " + z + ")";
    }
}

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        return startPoint.distance(endPoint);
    }
}

class Polygon {
    private List<Point> points;

    public Polygon() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            perimeter += points.get(i).distance(points.get((i + 1) % points.size()));
        }
        return perimeter;
    }
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Addition of p1 and p2: " + p1.add(p2));
        System.out.println("Subtraction of p1 and p2: " + p1.subtract(p2));
        System.out.println("Multiplication of p1 and p2: " + p1.multiply(p2));
        System.out.println("Division of p1 and p2: " + p1.divide(p2));

        Point3D p3d1 = new Point3D(1, 2, 3);
        Point3D p3d2 = new Point3D(4, 5, 6);

        System.out.println("Distance between p3d1 and p3d2: " + p3d1.distance(p3d2));
        System.out.println("Addition of p3d1 and p3d2: " + p3d1.add(p3d2));
        System.out.println("Subtraction of p3d1 and p3d2: " + p3d1.subtract(p3d2));
        System.out.println("Multiplication of p3d1 and p3d2: " + p3d1.multiply(p3d2));
        System.out.println("Division of p3d1 and p3d2: " + p3d1.divide(p3d2));

        Line line = new Line(p1, p2);
        System.out.println("Length of line from p1 to p2: " + line.length());

        Polygon polygon = new Polygon();
        polygon.addPoint(p1);
        polygon.addPoint(p2);
        polygon.addPoint(new Point(5, 9));
        System.out.println("Perimeter of polygon: " + polygon.perimeter());
    }

}
