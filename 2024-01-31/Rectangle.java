public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double lengthValue,
                     double widthValue) {
        length = lengthValue;
        width = widthValue;
    }

    public double area() {
        return length * width;
    }
}
