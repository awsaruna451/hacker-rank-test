public class LeetCodeFirstBadVersion {

    public int firstBadVersion(int n) {

        int beg =1, last = n, mid = 0;

        int badPos = last;
        while (beg <= last) {
            mid = beg + (last-beg)/2;

            boolean bad = isBadVersion(mid);
            if (bad) {
               last = mid-1;
               badPos = mid;
            } else {
                beg = mid +1;
            }

        }
       return badPos;
    }

    public boolean isBadVersion(int version) {
        return false;
    }

    public static void main(String[] args) {
        int[] x = new int[]{5};
        int[] y = new int[]{2,5,6};
       // System.out.println(search(x,5));
       /* int [] y = twoSum(x,9);
        System.out.println(y[0] +":::::" + y[1]);*/
    }
}
