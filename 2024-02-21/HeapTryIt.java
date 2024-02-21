class Student implements Comparable<Student> {
    public int priority;
    public String name;

    public Student(int priorityValue, String nameValue) {
        priority = priorityValue;
        name = nameValue;
    }

    public int compareTo(Student other) {
        return this.priority - other.priority;
    }
}


public class HeapTryIt {
    public static void main(String[] args) {
        BinaryHeap<Integer> myHeap = new BinaryHeap<>();
        myHeap.insert(5);
        myHeap.insert(7);
        myHeap.insert(3);
        myHeap.insert(11);
        System.out.println("Min value: " + myHeap.getMin());
        myHeap.display();

        System.out.println("Deleting items: ");
        System.out.println(myHeap.delete());
        System.out.println(myHeap.delete());
        System.out.println(myHeap.delete());
        System.out.println(myHeap.delete());

        BinaryHeap<Student> studentHeap = new BinaryHeap<>();
        studentHeap.insert(new Student(2, "Dave"));
        studentHeap.insert(new Student(5, "Quoc"));
        studentHeap.insert(new Student(1, "Thea"));
        Student nextOneUp = studentHeap.getMin();
        System.out.println("Priority and name: " + nextOneUp.priority + " " + nextOneUp.name);


    }
}
