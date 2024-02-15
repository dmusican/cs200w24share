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
        System.out.println(bt.key);
        System.out.println(bt.leftChild);
        System.out.println(bt.rightChild);
        bt.insertLeft("carleton");
        System.out.println(bt.key);
        System.out.println(bt.leftChild.key);
        System.out.println(bt.rightChild);

    }
}
