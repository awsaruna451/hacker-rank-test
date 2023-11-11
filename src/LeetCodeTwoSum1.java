public class LeetCodeTwoSum1 {

    public static int[] twoSum(int[] nums, int target) {

        int retVal[] = new int[2];
        for(int x =0; x < nums.length; x++) {
            int remainValue = target - nums[x];
                for(int y =x+1 ; y < nums.length; y++) {
                    if (nums[y] == remainValue) {
                        retVal[0] = x;
                        retVal[1] = y;
                        break;
                    }
                }
        }
       return retVal;
    }

    public static void main(String[] args) {
        int[] x = new int[]{2,7,11,15};
        int [] y = twoSum(x,9);
        System.out.println(y[0] +":::::" + y[1]);
    }
}
