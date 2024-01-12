public class Game {
    public static void main(String[] args) {
        double randThing = Math.random();
        Circle or Rectangle s;
        if (randThing > 0.5) {
            s = new Circle(10);
        } else {
            s = new Rectangle(2, 3);
        }
        System.out.println(s.area());
        System.out.println("again " + s.area());
}   
}
