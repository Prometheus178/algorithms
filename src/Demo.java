import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author: Sergey.
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length ; i++) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
