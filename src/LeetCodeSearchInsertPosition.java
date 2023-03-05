public class LeetCodeSearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int len = nums.length;
        int start = 0;
        return findPosition(nums, start, len, target);

    }

    public static int findPosition(int[] nums, int start, int end, int target) {

        if (nums[end-1] < target) {
            return end;
        }

        if (nums[start] < target ) {


            int index = start + (end - start) / 2;

            if (nums[index] == target) {
                return index;
            } else {
                if (nums[index] > target) {
                    return findPosition(nums, start, index, target);
                } else {
                    return findPosition(nums, index + 1, end, target);
                }
            }
        } else {
            return start;
        }

    }



    public static void main(String[] args) {
        int[] x = new int[]{5};
        int[] y = new int[]{1,3,5,6};
        System.out.println(searchInsert(y,7));
       /* int [] y = twoSum(x,9);
        System.out.println(y[0] +":::::" + y[1]);*/
    }
}
