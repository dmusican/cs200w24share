public class Circle extends Shape {
    private double radius;

    public Circle(String schiller,
                  double radiusValue) {
        super(schiller);
        radius = radiusValue;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}
