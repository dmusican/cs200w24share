public class Tester {
    public static void main(String[] args) {
        Circle c = new Circle("red", 3.2);
        Rectangle r = new Rectangle("blue", 9.3, 2.1);
        System.out.println(c.getColor());
        System.out.println(c.area());
        System.out.println(r.getColor());
        System.out.println(r.area());
    }
}
