// Adapted from "Problem Solving with Algorithms and Data Structures using
// Java", by Miller, Ranum, Yasinovskyy, and Eisenberg

public class BinarySearchTree<K extends Comparable<K>,
                                        V extends Comparable<V>> {
    class TreeNode {
        private K key;
        private V value;
        private TreeNode leftChild;
        private TreeNode rightChild;

        TreeNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        /* Is this a leaf node? (Leaf nodes have no children) */
        boolean isLeaf() {
            return (leftChild == null && rightChild == null);
        }
    }

    private TreeNode root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public TreeNode getRoot() {
        return root;
    }
    public void put(K key, V value) {
        if (this.root != null) {
            put(key, value, this.root);
        } else {
            this.root = new TreeNode(key, value);
        }
        this.size = this.size + 1;
    }

    void put(K key, V value, TreeNode currentNode) {
        if (key.compareTo(currentNode.key) < 0) {
            if (currentNode.leftChild != null) {
                put(key, value, currentNode.leftChild);
            } else {
                currentNode.leftChild = new TreeNode(key, value);
            }
        } else if (key.compareTo(currentNode.key) > 0) {
            if (currentNode.rightChild != null) {
                put(key, value, currentNode.rightChild);
            } else {
                currentNode.rightChild = new TreeNode(key, value);
            }
        } else {
            throw new RuntimeException("Duplicate key: " + key);
        }
    }

    public V get(K key) {
        if (this.root != null) {
            TreeNode result = get(key, this.root);
            if (result != null) {
                return result.value;
            }
        }
        return null;
    }

    TreeNode get(K key, TreeNode currentNode) {
        if (currentNode == null) {
            return null;
        }
        if (key.compareTo(currentNode.key) == 0) {
            return currentNode;
        } else if (key.compareTo(currentNode.key) < 0) {
            return get(key, currentNode.leftChild);
        } else {
            return get(key, currentNode.rightChild);
        }
    }
    public boolean containsKey(K key) {
        TreeNode result = get(key, this.root);
        return (result != null);
    }
    public String toString() {
        return stringify(this.root, 0);
    }

    // I modified this from the Runestone version, I think it's easier to read
    String stringify(TreeNode node, int indent) {
        String result = "";
        if (node != null) {
            if (node.isLeaf()) {
                result = "  ".repeat(indent) +  node.key + ":" + node.value + "\n";
            } else {
                result = "  ".repeat(indent) +  node.key + ":" + node.value + "\n"
                    + stringify(node.leftChild, indent+1)
                    + stringify(node.rightChild, indent+1);
            }
        } else {
            result = "  ".repeat(indent) + "[]\n";
        }
        return result;
    }

    // For when I'm here
    private void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.leftChild);
            System.out.println(node.key);
            inorder(node.rightChild);
        }
    }

    private void preorder(TreeNode node) {
        if (node != null) {
            System.out.println(node.key);
            preorder(node.leftChild);
            preorder(node.rightChild);
        }
    }

    public void inorder() {
        inorder(root);
    }

    public void preorder() {
        preorder(root);
    }
}
