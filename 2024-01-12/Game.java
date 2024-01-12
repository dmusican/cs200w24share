public class Game {
    public static void main(String[] args) {
        double randThing = Math.random();
        if (randThing > 0.5) {
            Circle s = new Circle(10);
        } else {
            Rectangle s = new Rectangle(2, 3);
        }
        System.out.println(s.area());
        System.out.println("again " + s.area());
}   
}
