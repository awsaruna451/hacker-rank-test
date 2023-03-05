import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HackerRankMonthPreparationKitDay1Q7 {

    public static List<Integer> countingSort(List<Integer> arr) {
        Map<Integer, Integer> countingSort = new HashMap<>();
        for(int i=0; i < 100; i++ ) {
            countingSort.put(i, 0);
        }

        // Write your code here
        for( int i = 0; i < arr.size(); i++) {

                if (countingSort.containsKey(arr.get(i))) {
                    countingSort.put(arr.get(i), countingSort.get(arr.get(i))+1);
                } else {
                    countingSort.put(arr.get(i), 1);
                }

        }

        return countingSort.values().stream().collect(Collectors.toList());

    }

    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));

    }
}

