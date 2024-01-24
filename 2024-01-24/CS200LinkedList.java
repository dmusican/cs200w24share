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
