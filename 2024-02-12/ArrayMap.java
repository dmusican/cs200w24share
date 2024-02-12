// Arrays are a slow way of doing this,
// but what the heck
public class ArrayMap<K, V> {

  public void put(K key, V value) {

  }

  public V get(K key) {

  }


  public static void main(String[] args) {

    ArrayMap<String, Integer> myMap =
      new ArrayMap<String, Integer>();
    myMap.put('Dave', 82);
    myMap.put('Quoc', 5);
    System.out.println(myMap.get('Quoc'));
  }
}
