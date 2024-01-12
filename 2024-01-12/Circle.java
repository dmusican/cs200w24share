public class Circle {
    private double radius;

    public Circle(double radiusValue) {
        radius = radiusValue;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}