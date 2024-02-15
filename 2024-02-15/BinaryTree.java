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
            BinaryTree<T> newChild = new BinaryTree<T>(newData);
            newChild.leftChild = leftChild;
            leftChild = newChild;
        }
    }

    public void insertRight(T newData) {
        if (rightChild == null) {
            rightChild = new BinaryTree<T>(newData);
        } else {
            BinaryTree<T> newChild = new BinaryTree<T>(newData);
            newChild.rightChild = rightChild;
            rightChild = newChild;
        }
    }

    public void displayTree(BinaryTree<T> start) {
        if (start == null) {
            return;
        }
        System.out.println(start.key);
        displayTree(start.leftChild);
        displayTree(start.rightChild);
    }

    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<String>("hello");
        bt.insertLeft("carleton");
        bt.insertLeft("schiller");
        bt.leftChild.insertRight("sayles");
        bt.insertRight("rottblatt");
        bt.insertRight("sproncert");
        bt.displayTree(bt);

    }
}
