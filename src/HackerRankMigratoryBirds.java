import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankMigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> values = new HashMap<>();
        for(int k=0; k < arr.size(); k++) {
            if (values == null || values.isEmpty()) {
                values.put(arr.get(k), 1);
            } else {
                if (values.containsKey(arr.get(k))) {
                    values.put(arr.get(k), (values.get(arr.get(k)) +1));
                } else {
                    values.put(arr.get(k), 1);
                }
            }
        }
        int maxValue = 0;
        int maxIndex = -1;

        for (Map.Entry<Integer, Integer> entries: values.entrySet()) {
              if (maxValue <= entries.getValue()) {

                  if (maxIndex != -1 && maxValue == entries.getValue()) {
                      if (maxIndex > entries.getKey()) {
                           maxIndex = entries.getKey();
                      }

                  } else {
                      maxIndex = entries.getKey();
                  }
                  maxValue = entries.getValue();
              }

        }
     return maxIndex;
    }

    public static void main(String ar[]) {
        System.out.println(migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)));
    }
}
