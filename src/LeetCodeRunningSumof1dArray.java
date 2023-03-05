import java.util.Arrays;

public class LeetCodeRunningSumof1dArray {

    public static int[] runningSum(int[] nums) {

        int p[] = new int[nums.length];

        for(int i =0; i < nums.length; i++) {

            int x = 0;
            int val = 0;
            while (x <= i) {

                val += nums[x];
                x++;

            }

            p[i] = val;
        }

        return p;
    }

    public static void main(String[] args) {
        System.out.println();
        Arrays.stream(runningSum(new int[]{1,2,3,4})).forEach(System.out::println);
    }
}
