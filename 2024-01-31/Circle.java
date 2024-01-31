public class Circle extends Shape {
    private double radius;

    public Circle(String colorValue,
                  double radiusValue) {
        super(colorValue);
        radius = radiusValue;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}
