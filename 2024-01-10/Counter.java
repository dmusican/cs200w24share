public class Counter {
    // instance variables
    public int value;

    // instance methods
    public void reset() {
        value = 0;
    }
    
    public void click() {
        value = value + 1;
    }

    public int getValue() {
        return value;
    }
}
