import java.util.Arrays;

public class LeetCodeContainsDuplicate1 {

    public static boolean containsDuplicate(int[] nums) {

        long count = Arrays.stream(nums).distinct().count();
        if (nums.length == count) {
            return false;
        }
   return true;
    }


    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(x));
    }
}
