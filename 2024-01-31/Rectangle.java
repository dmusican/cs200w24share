public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String colorValue,
                     double lengthValue,
                     double widthValue) {
        super(colorValue);
        length = lengthValue;
        width = widthValue;
    }

    public double area() {
        return length * width;
    }
}
