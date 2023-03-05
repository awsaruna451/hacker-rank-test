import java.util.Arrays;

public class LeetCodeTwoSum {

    public static int[] twoSum(int[] nums, int target) {
         int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int findValue = target - nums[i];
            int j = i+1;
            while (j < nums.length) {
                if (findValue == nums[j]) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
                j++;
            }
        }

        return index;

    }

    public static void main(String[] args) {
        int[] x = new int[]{2,7,11,15};
        int [] y = twoSum(x,9);
        System.out.println(y[0] +":::::" + y[1]);
    }
}
