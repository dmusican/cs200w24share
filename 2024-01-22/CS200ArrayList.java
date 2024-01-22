import java.util.Arrays;

public class CS200ArrayList<T> implements CS200List<T> {
    private T[] array;
    private int numberOfEntries;

    public CS200ArrayList() {
        numberOfEntries = 0;
        int defaultArraySize = 30;
        array = new T[defaultArraySize];
    }

    public int length() {
        return numberOfEntries;
    }

    public void addHead(T item) {
        // I'm full
        if (numberOfEntries == array.length) {
            array = Arrays.copyOf(array, 2*array.length);

        }
        for (int i=numberOfEntries; i >= 1; i--) {
            array[i] = array[i-1];
        }
        array[0] = item;
        numberOfEntries++;
    }

    public T getHead() {
        if (numberOfEntries > 0) {
            return array[0];
        } else {
            throw new RuntimeException(
                "BAD BAD BAD list is empty");
        }
    }
    
}
