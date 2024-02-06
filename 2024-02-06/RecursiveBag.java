public class RecursiveBag<T> {
    private T first;
    private RecursiveBag<T> rest;

    public RecursiveBag() {
        first = null;
        rest = null;
    }

    public void add(T item) {
        if (first == null) {
            first = item;
        } else if (rest == null) {
            rest = new RecursiveBag<T>();
            rest.add(item);
        } else {
            rest.add(item);
        }
    }

    public int getFrequency(T item) {
        if (first == null) {
            return 0;
        } else if (rest == null) {
            if (first.equals(item)) {
                return 1;
            } else {
                return 0;
            }
        }



    public static void main(String[] args) {
        RecursiveBag<String> rb =
            new RecursiveBag<String>();
        rb.add("a");
        rb.add("b");
        rb.add("c");
    }
