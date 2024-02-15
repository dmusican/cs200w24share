public class BinaryTree<T> {
    public T key;    // actual data
    public BinaryTree<T> leftChild;
    public BinaryTree<T> rightChild;

    public BinaryTree(T rootData) {
        key = rootData;
        leftChild = null;
        rightChild = null;
    }







    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<String>("hello");
        System.out.println(bt.key);
        System.out.println(bt.leftChild);
        System.out.println(bt.rightChild);
    }
}
