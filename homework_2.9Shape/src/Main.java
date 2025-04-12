public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(5.0f); // 1 argument → Circle
        System.out.println("Area of circle: " + circle.getArea());

        Shape rectangle = ShapeFactory.createShape(4.0f, 6.0f); // 2 arguments → Rectangle
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}