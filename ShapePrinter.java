import java.text.DecimalFormat;

public class ShapePrinter {
    private final DecimalFormat decimalFormat;

    public ShapePrinter() {
        decimalFormat = new DecimalFormat("#.##");
    }

    public void printShape(Shape shape) {
        System.out.println("Shape: " + shape.getShapeName() +
                ", Area: " +
                decimalFormat.format(shape.calculateArea()) +
                ", Perimeter: " +
                decimalFormat.format(shape.calculatePerimeter()));
    }
}