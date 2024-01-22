public class CS200ListTester {
    public static void main(String[] args) {
        CS200List<String> myList = new CS200ArrayList<String>();
        myList.addHead("Dave");
        myList.addHead("Quoc");
        System.out.println(myList.getHead());
        System.out.println(myList.length());
    }
    
}
