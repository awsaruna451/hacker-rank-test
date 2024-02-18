import java.util.ArrayList;
import java.util.List;

public class LeetCodeFindMinimuminRotatedSortedArray {

    public static int findMin(int[] nums) {

        int numRotate = 0;
        boolean isSorted = true;

        for(int n=0; n< nums.length-1; n++) {
            if(nums[n] > nums[n+1]) {
                isSorted = false;
                numRotate = nums.length - n;
                break;
            }
        }

        if (numRotate == nums.length) {
            numRotate = 0;
        }





        return nums[numRotate];

    }



    public static void main(String[] args) {
        int[] x = new int[]{2,1};
        int p = findMin(x);

       System.out.println(p);
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
