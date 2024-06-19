package SOLID.ShapeDrawing;

import java.util.HashMap;
import java.util.Map;

public class MainShapeDrawer {
    private final Map<String, Shape> shapes;

    public MainShapeDrawer() {
        shapes = new HashMap<>();
        shapes.put("circle", new Circle());
        shapes.put("rectangle", new Rectangle());
    }

    public void drawShape(String type) {
        Shape shape = shapes.get(type);
        if (shape != null) {
            shape.draw();
        } else {
            throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
