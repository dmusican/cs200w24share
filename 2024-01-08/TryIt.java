public class TryIt
{
    //def calculateDecades(age):
    public static double calculateDecades(int age)
    {
        double decades = age / 10.0;
        return decades;
    }

    public static void main(String[] args)
    {
        double answer1 = calculateDecades(9);
        double answer2 = calculateDecades(127);
        System.out.println(answer1);
        System.out.println(answer2);
    }
}