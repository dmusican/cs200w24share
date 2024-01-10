public class Counter {
    // instance variables
    public int value;

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
