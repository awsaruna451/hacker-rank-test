import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HackerRankWeekPreparationKitDay2Q1 {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> map =new HashMap<>();
        for(int k=0; k < a.size(); k++) {
            if (!Optional.ofNullable(map).isPresent()) {
                map.put(a.get(k), 1);
            } else {
                if (map.containsKey(a.get(k))) {
                    map.put(a.get(k), map.get(a.get(k)) +1);
                } else {
                    map.put(a.get(k), 1);
                }
            }
        }
        int key = 0;
        for (Map.Entry<Integer,Integer>  val : map.entrySet()){
            if (val.getValue() ==1) {
                key = val.getKey();
                break;
            }
        }

        return key;

    }
    public static void main(String[] args) {
       // check("I love Love to To tO code");
        System.out.println(lonelyinteger(List.of(1,2,3,4,3,2,1)));

    }
}

