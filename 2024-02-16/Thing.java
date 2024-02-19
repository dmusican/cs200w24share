import java.util.ArrayList;

public class Thing<K,V> {
    public ArrayList<V> makeOne(V item) {
        ArrayList<V> alist = new ArrayList<V>();
        alist.add(item);
        return alist;
    }

    public static void main(String[] args) {
        Thing<Integer, String> ts =
            new Thing<Integer, String>();
        ArrayList<String> result = ts.makeOne("hello");
    }
}
