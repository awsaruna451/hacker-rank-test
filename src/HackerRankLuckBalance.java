import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRankLuckBalance {


    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here

        int luckBalance = 0;
        int min = 0;
        int minIndex = 0;
        List<Integer> minValue = new ArrayList<>();
        for(List<Integer> integers: contests) {
            if (integers.get(1) == 1) {
                minValue.add(integers.get(0));
                minIndex++;
            }

            luckBalance += integers.get(0);
        }
        minIndex = minIndex-k;
        Collections.sort(minValue);

        for(int p =0; p < minIndex; p++) {
            min +=minValue.get(p);
        }

        luckBalance = luckBalance - (2*min);

       return luckBalance;
    }

    public static int luckBalancejava8(int k, List<List<Integer>> contests) {
        // Write your code here

        int luckBalance = 0;
        int min = 0;
        int minIndex = 0;
        List<Integer> minValue = new ArrayList<>();

         minIndex = (int) contests.stream().filter(val -> val.get(1)==1)
                .peek(val -> minValue.add(val.get(0)))
                .count();

         min = minValue.stream().sorted().limit(minIndex-k)
                 .mapToInt(Integer::intValue).sum();
         luckBalance = contests.stream().mapToInt(a -> a.get(0)).sum();

        luckBalance = luckBalance - (2*min);

        return luckBalance;
    }




    public static void main(String[] args) {
        List<List<Integer>> v = List.of( List.of(5, 1),List.of(2, 1),List.of(1, 1),List.of(8, 1),List.of(10, 0),List.of(5, 0) );
        System.out.println(luckBalancejava8(3,v));
    }
}
