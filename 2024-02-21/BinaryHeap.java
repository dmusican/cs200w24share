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

    private void percolateUp(int index) {
        while ((index > 0) && (index - 1) / 2 >= 0) {
            int parentIndex = (index - 1) / 2;
            if (compareItemsAt(index, parentIndex) < 0) {
                swapItemsAt(index, parentIndex);
            }
            index = parentIndex;
        }
    }

    public void insert(T item) {
        heap.add(item);
        percolateUp(heap.size() - 1);
    }

    private void percolateDown(int index) {
        while (2 * index + 1 < heap.size()) {
            int smallerChild = getSmallerChild(index);
            if (compareItemsAt(index, smallerChild) > 0) {
                swapItemsAt(index, smallerChild);
            } else {
                break;
            }
            index = smallerChild;
        }
    }

    private int getSmallerChild(int index) {
        if (2 * index + 2 > heap.size() - 1) {
            return 2 * index + 1;
        }
        if (compareItemsAt(2 * index + 1, 2 * index + 2) < 0) {
            return 2 * index + 1;
        }
        return 2 * index + 2;
    }

    public T delete() {
        T result = heap.get(0);
        swapItemsAt(0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        percolateDown(0);
        return result;
    }

    public T getMin() {
        return heap.get(0);
    }

    public void display() {
        if (heap.size() > 0) {
            display(0, 0);
        }
    }

    public void display(int root, int indent) {
        if (root < heap.size()) {
            System.out.println(" ".repeat(indent) + heap.get(root));
            display(2*root+1, indent+2);
            display(2*root+2, indent+2);
        }
    }

}
