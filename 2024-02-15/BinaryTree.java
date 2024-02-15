public class BinaryTree<T> {
    public T key;    // actual data
    public BinaryTree<T> leftChild;
    public BinaryTree<T> rightChild;

    public BinaryTree(T rootData) {
        key = rootData;
        leftChild = null;
        rightChild = null;
    }

    // insert before the left child, unless there is no
    // left child, in which case it just becomes your left
    // child
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

    public void displayTree(BinaryTree<T> start, int spaces) {
        if (start == null) {
            return;
        }
        for (int i=0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(start.key);
        displayTree(start.leftChild, spaces+1);
        displayTree(start.rightChild, spaces+1);
    }

    // THINGS TO ADD
    public void deleteLeftChild() {
    }

    // lefts become right, rights become left
    public void reverseAllChildren() {
    }

    // count number of times key appears in the tree
    public int count(T key) {
        return 0;
    }



    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<String>("hello");
        bt.insertLeft("carleton");
        bt.insertLeft("schiller");
        bt.leftChild.insertRight("sayles");
        bt.insertRight("rottblatt");
        bt.insertRight("sproncert");
        bt.displayTree(bt, 0);

    }
}
