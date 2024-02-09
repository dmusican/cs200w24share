// Less-than / greater-than extravaganza
public class Pair<T implements Comparable>{
  private T first;
  private T second;

  public Pair(T firstValue, T secondValue) {
    first = firstValue;
    second = secondValue;
  }

  public boolean inOrder() {
    if (first.compareTo(second)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Pair<String> p = new Pair("hi", "bye");
    System.out.println(p.inOrder());
  }
}
