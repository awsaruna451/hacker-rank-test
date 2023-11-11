import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankEqualizeTheArray {

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Map<Integer,Integer> countMap = new HashMap<>();
        for(Integer ar: arr) {

            if (countMap.isEmpty()) {
                countMap.put(ar, 1);
            } else{
                if (countMap.containsKey(ar)) {
                    countMap.put(ar, countMap.get(ar) +1);
                } else {
                    countMap.put(ar, 1);
                }
            }

        }
        int maxCount = 0;
        int maxValue= 0;
        int deleteCount = 0;
        for(Map.Entry<Integer, Integer> values: countMap.entrySet()) {
            if (maxCount < values.getValue()) {

                maxCount = values.getValue();


            }
            deleteCount += values.getValue();
        }

        return deleteCount-maxCount;

    }

    public static void main(String[] args) {
      Integer val = equalizeArray(List.of(10, 27 ,9 ,10, 100 ,38 ,30 ,32, 45 ,29 ,27, 29 ,32, 38 ,32, 38, 14 ,38 ,29, 30, 63 ,29 ,63, 91 ,54 ,10 ,63));
        System.out.println(val);
    }

}
