public class User {
    public static void main(String[] args) {
        Thing<Integer> t = new Thing<Integer>();
        t.value = 12;
        System.out.println(t.value);
        Thing<String> other = new Thing<String>();
        other.value = "hello";
    }
    
}
