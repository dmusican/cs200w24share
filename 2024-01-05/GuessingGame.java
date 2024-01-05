// Guessing game where user can try to guess the mystery number
import java.util.*;
public class GuessingGame
{
    public static void main(String[] args)
    {
        int secret = 47;
        int guess = -1;
        Scanner in = new Scanner(System.in);
        while (guess != secret)
        {
            System.out.print("Make a guess: ");
            guess = in.nextInt();
        }
    }
}