import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankSalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        int count = 0;
        Map<Integer,Integer> mapPair = new HashMap<>();
        // Write your code here
        for(int a=0; a < ar.size(); a++) {

            if(mapPair == null || mapPair.isEmpty()) {
                mapPair.put(ar.get(a), 1);
            } else {
                if (mapPair.containsKey(ar.get(a))) {
                    mapPair.put(ar.get(a), mapPair.get(ar.get(a))+1);
                } else {
                    mapPair.put(ar.get(a), 1);
                }
            }

        }
        for (Map.Entry<Integer, Integer> entry: mapPair.entrySet()) {

            count += Math.ceil(entry.getValue()/2);

        }
      return count;
    }

    public static void main(String ar[]) {
        System.out.println(sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

}
