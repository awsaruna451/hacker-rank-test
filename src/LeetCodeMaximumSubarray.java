import java.util.Arrays;

public class LeetCodeMaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, maxEndingValue = Integer.MIN_VALUE, maxValue = 0;
        for(int i = 0; i < nums.length; i++) {
            maxValue += nums[i];

            if (maxValue > max) {
                max = maxValue;
            } else {

                   if (maxValue > 0 ) {
                       continue;
                   } else {

                       if (maxEndingValue < max) {
                           maxEndingValue = max;
                       }
                       maxValue = 0;
                      // max = 0;
                   }

            }
        }
        if (maxEndingValue > max) {
            max = maxEndingValue;
        }
        if (nums[nums.length-1] > max) {
            max = nums[nums.length-1];
        }

        return max;

    }

    public static void main(String[] args) {
        int[] x = new int[]{-2,1};
        System.out.println(maxSubArray(x));
    }
}
