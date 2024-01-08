import java.util.Scanner;

public class TryIt2
{
    //def calculateDecades(age):
    public static double calculateDecades(int age)
    {
        double decades = age / 10.0;
        return decades;
    }

    public static void main(String[] args)
    {
        System.out.print("How old are you? ");
        Scanner input = new Scanner(System.in);
        int yourAge = input.nextInt();
        double answer1 = calculateDecades(yourAge);
        System.out.println(answer1);
        System.out.println(answer2);
    }
}