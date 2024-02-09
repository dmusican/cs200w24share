// Less-than / greater-than extravaganza
public class Example2 {
  public static void main(String[] args) {
    String x = "hi";
    String y = "bye";
    System.out.println(x.compareTo(y));
    if (x.compareTo(y) < 0){
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
