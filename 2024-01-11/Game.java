public class Game {
    public static void main(String[] args) {
        Die die1 = new Die(6);
        Die die2 = new Die(20);

        System.out.println(die1.getShowing());
        System.out.println(die2.getShowing());
        
        die1.roll();
        die2.roll();

        System.out.println(die1.getShowing());
        System.out.println(die2.getShowing());

    }
}