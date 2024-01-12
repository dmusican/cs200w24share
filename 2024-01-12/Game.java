public class Game {
    public static void main(String[] args) {
        double randThing = Math.random();
        if (randThing > 0.5) {
            Circle c = new Circle(10);
            System.out.println(c.area());
            System.out.println(c.area());
        } else {
            Rectangle r = new Rectangle(2, 3);
            System.out.println(r.area());
            System.out.println(r.area());
        }
    }   
}
