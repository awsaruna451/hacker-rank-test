import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankBirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for(int k=0; k< candles.size();k++) {

            if (candles.get(k) >= max) {
                if (count == null || count.size() == 0) {
                    count.put(candles.get(k), 1);
                } else {
                    if (count.containsKey(candles.get(k))) {
                        count.put(candles.get(k), count.get(candles.get(k))+1);
                    } else {
                        count.put(candles.get(k), 1);
                    }
                }

                max = candles.get(k);

            }

        }
      return count.get(max);
    }

    public static void main(String ar[]) {
        System.out.println(birthdayCakeCandles(List.of(18,90,90,13,90,75,90,8,90,43)));
    }
}
