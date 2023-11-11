import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int arry[] = new int[nums.length];
        int leftArray[] = new int[nums.length];
        int rightArray[] = new int[nums.length];
        int leftArrayValue =1;
        int rightArrayValue = 1;
        for(int i=0; i < nums.length; i++) {

            leftArray[i]= leftArrayValue;
            leftArrayValue *= nums[i];

        }
        for(int i=nums.length-1; i >= 0; i--) {

            rightArray[i]= rightArrayValue;
            rightArrayValue *= nums[i];

        }

        for(int i=0; i < nums.length; i++) {
            arry[i] = leftArray[i] * rightArray[i];
        }

     return arry;
    }

    public static void main(String[] args) {
       int[] x = new int[]{1,2,3,4};
       int [] y = productExceptSelf(x);
       for(int k = 0; k < y.length; k++) {
           System.out.println(y[k]);
       }




       // System.out.println(containsDuplicate(x));
    }


}
