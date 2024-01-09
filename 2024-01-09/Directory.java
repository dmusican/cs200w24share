public class Directory {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dave";
        s1.age = 27;
        
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.doBirthday();
        System.out.println(s1.age);

        Student s2 = new Student();
        s2.name = "Thea";
        s2.age = 45;

    }
}