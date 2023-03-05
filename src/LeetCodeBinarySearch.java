public class LeetCodeBinarySearch {

    public static int search(int[] nums, int target) {
       return binarySear(nums, 0, nums.length-1, target);

    }

    public static int binarySear(int[] s, int first, int last, int target) {

        if (last > first) {
            int index = first + (last - first) / 2;
            if (s[index] > target) {
                return binarySear(s, first, index, target);
            } else {
                if (s[index] == target) {
                    return index;

                } else {
                    return binarySear(s, index+1, last , target);
                }
            }

        } else {
            if (last == first && s[last] == target) {
               return last;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] x = new int[]{5};
        int[] y = new int[]{2,5,6};
        System.out.println(search(x,5));
       /* int [] y = twoSum(x,9);
        System.out.println(y[0] +":::::" + y[1]);*/
    }
}
