// Arrays are a slow way of doing this,
// but what the heck
class Entry<K,V> {
  public K key;
  public V value;
}

public class ArrayMap<K, V> {
  private ArrayList<Entry<K,V>> array;

  public ArrayMap() {
    array = new ArrayList<Entry<K,V>>();
  }

  public void put(K key, V value) {
    for (int i=0; i < array.size(); i++) {
      if (array.get(i).key == key) {
        array.get(i).value = value;
        return;
      }
    }
    Entry<K,V> newEntry = new Entry<K,V>();
    newEntry.key = key;
    newEntry.value = value;
    array.add(newEntry);
  }

  public V get(K key) {
    for (int i=0; i < array.size(); i++) {
      if (array.get(i).key == key) {
        return array.get(i).value;
      }
    }
    return null;
  }


  public static void main(String[] args) {

    ArrayMap<String, Integer> myMap =
      new ArrayMap<String, Integer>();
    myMap.put('Dave', 82);
    myMap.put('Quoc', 5);
    System.out.println(myMap.get('Quoc'));
  }
}
