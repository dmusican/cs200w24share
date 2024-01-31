public class Tester {
    public static void main(String[] args) {
        Circle c = new Circle(3.2);
        Rectangle r = new Rectangle(9.3, 2.1);
        System.out.println(c.getColor());
        System.out.println(c.area());
        System.out.println(r.getColor());
        System.out.println(r.area());
    }
}
