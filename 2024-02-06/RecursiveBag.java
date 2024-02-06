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
