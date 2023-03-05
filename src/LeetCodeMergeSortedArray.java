import java.util.Arrays;

public class LeetCodeMergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (k >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }

    }

    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,0,0,0};
        int[] y = new int[]{2,5,6};
        merge(x,3,y,3);
       /* int [] y = twoSum(x,9);
        System.out.println(y[0] +":::::" + y[1]);*/
    }
}
