public class BSTTryIt {

    public static void main(String[] args) {
        BinarySearchTree<String, String> tree = new BinarySearchTree<>();

        tree.put("France", "Paris");
        tree.put("Japan", "Tokyo");
        tree.put("Albania", "Tirana");
        tree.put("Madagascar", "Antananarivo");
        tree.put("Zimbabwe", "Harare");
        tree.put("South Korea", "Seoul");
        tree.put("Canada", "Ottawa");
        System.out.println(tree); // show tree at its current state

        System.out.println("inorder:");
        tree.inorder();
        System.out.println("\npreorder:");
        tree.preorder();
    }
}
