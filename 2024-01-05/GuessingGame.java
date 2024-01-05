// Guessing game where user can try to guess the mystery number
import java.util.*;
public class GuessingGame
{
    public static void main(String[] args)
    {
        int secret = 47;
        int guess = -1;
        Scanner orange;
        orange = new Scanner(System.in);
        while (guess != secret)
        {
            System.out.print("Make a guess: ");
            guess = orange.nextInt();
            if (guess < secret)
            {
                System.out.println("too small!");
            }
            else if (guess > secret)
            {
                System.out.println("too big");
            }
            else
            {
                System.out.println("you got it");
            }
        }
        orange.close();
    }
}