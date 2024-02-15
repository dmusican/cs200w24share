public class BinaryTree<T> {
    public T key;    // actual data
    public BinaryTree<T> leftChild;
    public BinaryTree<T> rightChild;

    public BinaryTree(T rootData) {
        key = rootData;
        leftChild = null;
        rightChild = null;
    }

    public void insertLeft(T newData) {
        if (leftChild == null) {
            leftChild = new BinaryTree<T>(newData);
        } else {
            throw new RuntimeException("leftChild already there");
        }
    }

    public void insertRight(T newData) {
        if (rightChild == null) {
            rightChild = new BinaryTree<T>(newData);
        } else {
            throw new RuntimeException("rightChild already there");
        }
    }

    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<String>("hello");
        bt.insertLeft("carleton");
        bt.insertLeft("schiller");

    }
}
