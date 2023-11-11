import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerRankFairRations {

    public static String fairRations(List<Integer> B) {

        // Write your code here

        if (B.size() <=2 ) {
            return "NO";
        }

        long k = B.stream().filter(s -> s%2 !=0).count();
        if (k % 2 != 0) {
            return "NO";
        }


        Map<Integer, Integer> val = IntStream.range(0, B.size()).boxed().collect(Collectors.toMap(index -> index, B::get));
        boolean isAllEven = true;
        int count = 0;
        do {
            for(Map.Entry<Integer,Integer> x: val.entrySet()) {
                isAllEven = true;
                if (x.getValue() %2 != 0) {
                    count++;
                    isAllEven = false;
                    if (x.getKey() == val.size() -1) {
                        val.put(x.getKey() -1, val.get(x.getKey()) + 1);
                        val.put(x.getKey() , val.get(x.getKey()) + 1);
                    } else {
                        val.put(x.getKey(), val.get(x.getKey()) + 1);
                        val.put(x.getKey() + 1, val.get(x.getKey()+1) + 1);
                    }
                    break;

                }

            }

        } while (!isAllEven);

        return (count*2)+"";

    }




    public static void main(String[] args) {

      System.out.println(fairRations(List.of(2, 3, 4, 5, 6)));
    }

}
