package filesProject;

public class ThreeDPoint extends Pointt {
    private int z;

    public ThreeDPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void move(int dx, int dy, int dz) {
        super.move(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "ThreeDPoint(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
