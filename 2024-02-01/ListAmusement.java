import java.util.Arrays;
import java.util.List;
class ListAmusement {
    public static int sumList(List<Integer> nums) {
        if (nums.size() == 1) {
            return nums.get(0);
        } else {
            // first item plus sum of the rest
            return
                nums.get(0) +
                sumList(nums.subList(1,nums.size()));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 2, 3, 7);
        System.out.println(sumList(list));
    }
}