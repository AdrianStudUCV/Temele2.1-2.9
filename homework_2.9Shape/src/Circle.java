public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float)(Math.PI * radius * radius);
    }
}