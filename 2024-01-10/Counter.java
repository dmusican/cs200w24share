public class Counter {
    // instance variables
    private int value;

    // instance methods
    public void reset(int startValue) {
        value = startValue;
    }
    
    public void click() {
        value = value + 1;
    }

    public int getValue() {
        return value;
    }
}
