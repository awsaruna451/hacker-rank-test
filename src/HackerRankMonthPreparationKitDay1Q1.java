import java.text.DecimalFormat;
import java.util.*;

public class HackerRankMonthPreparationKitDay1Q1 {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for (int x = 0; x < strings.size(); x++) {

            if (!Optional.ofNullable(map).isPresent()) {
                map.put(strings.get(x), 1);
            } else {
                if (map.containsKey(strings.get(x))) {
                    map.put(strings.get(x), map.get(strings.get(x))+1);
                } else {
                    map.put(strings.get(x), 1);
                }
            }

        }

        List<Integer> list = new ArrayList<>();

        for (int a = 0; a < queries.size(); a++) {
            if (Optional.ofNullable(map.get(queries.get(a))).isPresent()) {
                list.add(map.get(queries.get(a)));
                //System.out.println();
            } else {
                list.add(0);
            }
        }

      return list;
    }
    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

    }
}

