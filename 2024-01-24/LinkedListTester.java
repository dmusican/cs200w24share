class LinkedListTester {
  public static void main(String[] args) {
    CS200List<String> list =
      new CS200LinkedList<String>();
    list.addHead("elk");
    list.addHead("moose");
    list.printout();
  }
}
