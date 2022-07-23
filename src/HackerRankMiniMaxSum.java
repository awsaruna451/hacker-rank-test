import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HackerRankMiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

         int mini = 1000000000, max =0;
         long sum = 0;

         for (int x =0; x < arr.size();x++) {
             if (mini > arr.get(x)) {
                 mini = arr.get(x);
             }
             if (max < arr.get(x)) {
                 max = arr.get(x);
             }

             sum += arr.get(x);

         }
        System.out.println(sum);

        System.out.println((sum-max)+ " "+(sum-mini));

    }

    public static void main(String ar[]) {
        miniMaxSum(List.of(256741038,623958417,467905213,714532089,938071625));
    }
}
