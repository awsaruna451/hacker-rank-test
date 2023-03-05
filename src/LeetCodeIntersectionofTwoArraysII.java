import java.util.*;
import java.util.stream.Collectors;

public class LeetCodeIntersectionofTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> matchValue = new HashMap<>();

        for(int x = 0; x < nums1.length; x ++) {
            int y =0;
            while (y < nums2.length) {
                if (nums1[x] == nums2[y]) {
                    if (matchValue.isEmpty()) {
                        matchValue.put(y, nums2[y]);
                        break;
                    } else {
                        if (matchValue.containsValue(nums2[y]) ) {
                            if (matchValue.get(y) == null) {
                                matchValue.put(y, nums2[y]);
                                break;
                            }
                        } else {
                            matchValue.put(y, nums2[y]);
                            break;
                        }
                    }
                }
                y++;
            }

       /*     for (int j = 0 ; j < nums2.length; j++) {

                if (nums1[x] == nums2[j]) {

                    if (matchValue.isEmpty()) {
                        matchValue.put(j, nums2[j]);
                    } else {
                        if (matchValue.containsValue(nums2[j]) && matchValue.get(j) == null) {
                            matchValue.put(j, nums2[j]);
                        } else {
                            matchValue.put(j, nums2[j]);
                        }
                    }

                }

            }*/



        }



    int []value = new int[matchValue.size()];
        int i = 0;
        for (Map.Entry<Integer,Integer> map: matchValue.entrySet()) {
            value[i] = map.getValue();
            i++;
        }




       return value;

    }

    public static void main(String[] args) {
        int[] x = new int[]{1,2,2,1};
        int[] y = new int[]{2,2};
        intersect(x,y);
       int [] p = intersect(x,y);
        System.out.println(Arrays.toString(p));
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
