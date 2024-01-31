public class Rectangle {
    private double length;
    private double width;
    private String color;

    public Rectangle(double lengthValue,
                     double widthValue) {
        length = lengthValue;
        width = widthValue;
    }

    public double area() {
        return length * width;
    }

    public String getColor() {
        return color;
    }
}
