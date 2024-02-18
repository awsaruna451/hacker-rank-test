import java.util.TreeMap;

public class LeetCodeMaximumSubarray1 {

    public static int maxSubArray(int[] nums) {

            int start = 0;
            int remove = 0;

            int maxValue = 0;
            int globalMax = Integer.MIN_VALUE;

            while (start < nums.length) {

                maxValue += nums[start];

                if (maxValue < nums[start]) {
                    maxValue = nums[start];
                }

                if (maxValue > globalMax) {
                    globalMax = maxValue;
                }
                start++;

            }

            return globalMax;

    }

    public static void main(String[] args) {
        int ar[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
      System.out.println(maxSubArray(ar));
    }
}
