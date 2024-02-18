import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCodeMaximumProductSubarray {

    public static int maxProduct(int[] nums) {

        int x =0;
        int maxVal = 1;
        int lastMax = 1;
        int maxVal1 = Integer.MIN_VALUE;
        int maxGlobal = Integer.MIN_VALUE;
        for(int k = 0; k < nums.length; k++) {
            if (maxVal == 0) {
                maxVal = nums[k];
            } else {
                maxVal *= nums[k];
            }
            if(lastMax == 0) {
                lastMax = nums[nums.length - 1 - k];
            } else {
                lastMax *= nums[nums.length - 1 - k];
            }

            maxVal1 = Math.max(maxVal, lastMax);
            if (maxVal1> maxGlobal) {
                maxGlobal = maxVal1;
            }
        }


        return maxGlobal;

    }

    public static void main(String[] args) {
        int v[] = new int[] {-3,0,1,-2};
        System.out.println(maxProduct(v));
    }
}
