package Poits;

public class ThreeDPoint extends Point {
    private double z;

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public ThreeDPoint add(ThreeDPoint p) {
        return new ThreeDPoint(this.x + p.x, this.y + p.y, this.z + p.z);
    }

    public ThreeDPoint subtract(ThreeDPoint p) {
        return new ThreeDPoint(this.x - p.x, this.y - p.y, this.z - p.z);
    }

    public double distance(ThreeDPoint p) {
        return Math.sqrt(Math.pow(this.x + p.x, 2) + Math.pow(this.y + p.y, 2) + Math.pow(this.z + p.z, 2));
    }

    @Override
    public String toString() {
        return "3DPoint(" + x + ", " + y + ", " + z + ")";
    }
}
