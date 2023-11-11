import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HackerRankLonelyInteger {



    public static void main(String[] args) {
        //System.out.println(equalStacks(List.of(1,2,1,1), List.of(1,1,2), List.of(1,1)));
    }
    public static int lonelyinteger(List<Integer> a) {

        if (a.size() > 1) {
            // Write your code here
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < a.size(); i++) {

                if (Optional.ofNullable(map).isPresent()) {
                    if (map.containsKey(a.get(i))) {
                        map.put(a.get(i), map.get(a.get(i)) + 1);
                    } else {
                        map.put(a.get(i), 1);
                    }
                } else {
                    map.put(a.get(i), 1);
                }
            }

            for (Map.Entry<Integer, Integer> ma : map.entrySet()) {
                if (ma.getValue() == 1) {
                    return ma.getKey();
                }
            }

        } else {
            return a.get(0);
        }

        return 0;

    }
}
