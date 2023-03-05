import java.text.DecimalFormat;
import java.util.List;

public class HackerRankWeekPreparationKitDay1Q2 {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long maxValue=0, sum =0;
        long minValue =9999999999l;
        for (int i =0; i < arr.size(); i++) {

            sum += arr.get(i);
            if (maxValue < arr.get(i)) {
                maxValue = arr.get(i);
            }

            if (minValue > arr.get(i)) {
                minValue = arr.get(i);
            }
        }

        System.out.println((sum-maxValue) + " "+ (sum -minValue));

    }
    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

    }
}

