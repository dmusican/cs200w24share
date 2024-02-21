import java.util.ArrayList;

class BinaryHeap<T extends Comparable<T>> {
    private ArrayList<T> heap;

    public BinaryHeap() {
        this.heap = new ArrayList<T>();
    }

    private int compareItemsAt(int index1, int index2) {
        return heap.get(index1).compareTo(heap.get(index2));
    }

    private void swapItemsAt(int index1, int index2) {
        T temporary = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temporary);
    }
    public void insert(T item) {









    }

    public T delete() {











    }

    public T getMin() {




    }

    // Display heap horizontally, similarly to how we did with binary search trees.
    // Each node should appear on a line by itself; its two children are indented below it,
    // the left child first, then the right child.
    public void display() {



    }
}
