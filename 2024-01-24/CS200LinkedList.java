class Node<T> {
  public T data;
  public Node<T> next;
}

public class CS200LinkedList<T>
  implements CS200List<T> {

  private Node<T> head;

  public CS200LinkedList() {
    head = null;
  }

  // This methods adds an item to the head
  // of the list
  public void addHead(T item) {
    Node<T> nodeToAdd = new Node<T>();
    nodeToAdd.data = item;
    nodeToAdd.next = head;
    head = nodeToAdd;
  }
}

// imagine I have a main
// CS200List<String> list =
//      new CS200LinkedList<String>();
