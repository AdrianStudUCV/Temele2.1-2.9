public class ShapeFactory {
    public static Shape createShape(float... args) {
        if (args.length == 1) {
            return new Circle(args[0]);
        } else if (args.length == 2) {
            return new Rectangle(args[0], args[1]);
        } else {
            throw new IllegalArgumentException("Invalid number of arguments. Use 1 for Circle or 2 for Rectangle.");
        }
    }
}