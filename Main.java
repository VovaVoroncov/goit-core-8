public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();
        Shape rectangle = new Rectangle(5.5, 10);
        Shape square = new Square(10.5);
        Shape triangle = new Triangle(3.6, 6.2, 9.4);
        Shape circle = new Circle(5.5);
        Shape ellipse = new Ellipse(15.32, 5.3);

        printer.printShape(rectangle);

        printer.printShape(square);

        printer.printShape(triangle);

        printer.printShape(circle);

        printer.printShape(ellipse);
    }
}
