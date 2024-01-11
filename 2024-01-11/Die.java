public class Die {
    // instance variables
    private int numSides;
    private int showing;

    // constructor
    public Die(int numSidesValue) {
        numSides = numSidesValue;
        showing = 1;
    }

    public int getShowing() {
        return showing;
    }

    public void roll() {
        showing =
           (int)(Math.random()*numSides + 1);
    }
    
}
