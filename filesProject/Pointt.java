package filesProject;

public class Pointt {
    private int x;
    private int y;

    public Pointt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
