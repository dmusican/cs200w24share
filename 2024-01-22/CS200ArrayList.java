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
        for (int i=numberOfEntries; i >= 1; i--) {
            array[i] = array[i-1];
        }
        array[0] = item;
        numberOfEntries++;
    }
    
}
