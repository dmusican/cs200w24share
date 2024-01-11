public class Die {
    // instance variables
    private int numSides;
    private int showing;
    private static int numDiceMade = 0;

    // constructor
    public Die(int numSidesValue) {
        numSides = numSidesValue;
        showing = 1;
        numDiceMade = numDiceMade + 1;
    }

    public int getShowing() {
        return showing;
    }

    public void roll() {
        showing =
           (int)(Math.random()*numSides + 1);
    }

    public static int getNumDiceMade() {
        return numDiceMade;
    }
    
}
