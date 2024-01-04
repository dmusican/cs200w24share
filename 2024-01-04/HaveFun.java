import java.util.Scanner;

public class HaveFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name:");
        String response = in.nextLine();
        System.out.println("Your name is " + response);
    }
}