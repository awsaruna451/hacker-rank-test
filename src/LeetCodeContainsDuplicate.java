import java.util.Arrays;
import java.util.List;

public class LeetCodeContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        long distinct = Arrays.stream(nums).distinct().count();
        long count = nums.length;
        if (count != distinct)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(x));
    }
}
