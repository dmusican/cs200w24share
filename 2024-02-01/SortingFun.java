import java.util.Arrays;
import java.util.List;
public class SortingFun {
    public static boolean checkSorted(List<Integer> nums) {
        if (nums.size() == 1) {
            return true;
        } else if (nums.size() == 2) {
            return (nums.get(0) <= nums.get(1));
        } else {
            return
                (nums.get(0) <= nums.get(1)) &&
                 checkSorted(nums.subList(1, nums.size())));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 2, 3, 7);
        System.out.println(checkSorted(list));
    }
}
