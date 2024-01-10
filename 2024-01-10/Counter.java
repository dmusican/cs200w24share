public class Counter {
    // instance variables
    // style: all should be private
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
