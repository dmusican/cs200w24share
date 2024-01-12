public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(int lengthValue, int widthValue) {
        length = lengthValue;
        width = widthValue;
    }

    public double area() {
        return length * width;
    }
}