public class Tally {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.reset(6);
        c1.click();
        c1.click();
        int current = c1.getValue();
        System.out.println("c1 shows " + current);
        c1.click();
        Counter c2 = new Counter();
        c2.click();
        System.out.println("c1 shows " + c1.getValue());
        System.out.println("c2 shows " + c2.getValue());
        
    }
}