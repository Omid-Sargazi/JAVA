package DesignPattern.ShapeFActoryDesign;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
