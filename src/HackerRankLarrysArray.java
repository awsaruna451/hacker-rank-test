import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HackerRankLarrysArray {

/*    public static String larrysArray(List<Integer> A) {
        // Write your code here
        int count = 0;
        Map<Integer, Integer> indexValues = new TreeMap<>();
        for (int i=0; i < A.size(); i++) {
            indexValues.put(A.get(i), i);
        }

        int val = 0;

        for(Map.Entry<Integer, Integer> entry: indexValues.entrySet()) {
             if (entry.getValue()-val > 0) {
                 count += (entry.getValue()-val);
             }
             val++;
        }

        if (count%2 == 0) {
            return "YES";
        }
        return "NO";
    }*/

    public static String larrysArray(List<Integer> A) {
        // Write your code here
        int count = 0;
        for (int i=0; i < A.size(); i++) {
            int var = i-1;
            while (var >=0) {
                if (A.get(var) > A.get(i)) {
                    count++;
                }
                var--;
            }

/*            for(int j =i-1; j >= 0; j--) {
                if (A.get(j) > A.get(i)) {
                    System.out.println("j::" + A.get(j) + "  i::"+ A.get(i));
                    count++;
                }
            }*/
        }

        if (count %2 == 0) {
            return "YES";
        }
        return "NO";
    }


    public static void main(String[] args) {
        System.out.println(larrysArray(List.of(1,6,5,2,3,4)));
    }

}
