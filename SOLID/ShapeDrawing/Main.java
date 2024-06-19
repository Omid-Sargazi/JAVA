package SOLID.ShapeDrawing;

public class Main {
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.darwShape("circle");
        shapeDrawer.darwShape("rectangle");
        ////////////////////////////// after SOLID

        MainShapeDrawer shaper = new MainShapeDrawer();
        shaper.drawShape("circle");
    }
}
