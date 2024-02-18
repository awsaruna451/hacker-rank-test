import java.util.*;

public class LeetCode3Sum {
/*
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> v = new ArrayList<>();

        Set<List<Integer>> l = new HashSet<>();


        ArrayList<Integer> val = new ArrayList<Integer>();

        for(int i=0; i < nums.length; i++) {
            int sum = nums[i];
            int count = 1;
            val.add(sum);
            for(int j = 0; j < nums.length; j++) {

                if(i==j) {
                    continue;
                } else {
                   sum += nums[j];

                   if(sum == 0 && count==3) {

                   } else if(count < 3) {
                       val.add(nums[j]);
                   } else {
                       v = new ArrayList<>();
                       count =1;
                       val.add(nums[i]);
                   }

                }
                if (!val.isEmpty()) {
                   // Collections.sort(val);
                     l.add(val);
                    val = new ArrayList<>();
                }


            }


        }
       if (!l.isEmpty()) {
         l.forEach(e -> v.add(e));
       }

        return v;

    }*/

    public static List<List<Integer>> threeSum1(int[] nums) {

        List<List<Integer>> totl = new ArrayList<>();
        List<Integer> inv = new ArrayList<>();
        Set<List<Integer>> setSortv = new HashSet<>();

        for(int i=0; i < nums.length; i++) {
            int p = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                int q = nums[j];

                for(int k = 0; k < nums.length; k++) {
                    if(k == j || i == k) {
                        continue;
                    } else {

                        if ((p +q + nums[k]) == 0) {
                            inv.add(p);
                            inv.add(q);
                            inv.add(nums[k]);
                            Collections.sort(inv);
                            setSortv.add(inv);
                            inv = new ArrayList<>();

                        }

                    }
                }
            }
        }

        if(!setSortv.isEmpty()) {
            setSortv.forEach(e -> totl.add(e));
        }

        return totl;

    }


    public static void main(String[] args) {

       // System.out.println(longestPalindrome2("babaddtattarrattatddetartrateedredividerb"));
        int [] x = new int[] {-1,0,1,2,-1,-4};
      //  int [] x = new int[] {-0,1,1};
      //  int [] x = new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> v = threeSum1(x);

        v.forEach(s -> System.out.println(s));

    }
}
