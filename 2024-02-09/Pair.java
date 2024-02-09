// Less-than / greater-than extravaganza
public class Pair<T> {
  private T first;
  private T second;

  public Pair(T firstValue, T secondValue) {
    first = firstValue;
    second = secondValue;
  }

  public boolean inOrder() {
    if (first < second) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Pair<String> p = new Pair();
  }
}
