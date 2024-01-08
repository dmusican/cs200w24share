public class TryIt3 {
    public static int addItUp(int[] numbers)
    {
        int total = 0;
        for (int index=0; index < numbers.length; index++)
        {
            total = total + numbers[index];
        }
        return total;
    }


    public static void main(String[] args)
    {
        int[] stuff = {9, 2, 3, 5, 7};
        int[] otherstuff = {6, 2, 3};
        int total1 = addItUp(stuff);
        int total2 = addItUp(otherstuff);
        System.out.println(total1);
        System.out.println(total2);
    }
}
