import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HackerRankMinimumAbsoluteDifference {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here

        int min = 1000000000;

        for (int i = 0; i < arr.size(); i++) {

        /*    for(int j =i+1 ; j < arr.size(); j++) {
                int val = Math.abs(arr.get(i)- arr.get(j));
                if (val < min)
                    min = val;
            }
            */
            int j = i + 1;

            while (j < arr.size()) {
                int val = Math.abs(arr.get(i) - arr.get(j));
                if (val < min)
                    min = val;

                j++;
            }

        }


        return min;

    }


    public static void main(String[] args) {

        System.out.println(minimumAbsoluteDifference(List.of(3, -7, 0)));

    }


}
