import java.util.ArrayList;

public class Thing<V> {
    public ArrayList<V> makeOne(V item) {
        ArrayList<V> alist = new ArrayList<V>();
        alist.add(item);
        return alist;
    }

    public static void main(String[] args) {
        Thing<String> ts = new Thing<String>();
        ArrayList<String> result = ts.makeOne("hello");
    }
}
