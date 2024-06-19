package SOLID.ShapeDrawing;

public class ShapeDrawer {
    public void darwShape(String type) {
        if (type.equals("circle")) {
            drawCircle();
        } else if (type.equals("rectangle")) {
            drawRectangle();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }

    private void drawCircle() {
        System.out.println("Drawing a circle");
    }

    public void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }
}
