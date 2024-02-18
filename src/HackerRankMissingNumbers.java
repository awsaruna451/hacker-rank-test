import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankMissingNumbers {


    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        Map<Integer,Integer> first = new HashMap<>();
        List<Integer> extra = new ArrayList<>();


        for(int k=0;k < brr.size(); k++) {

            if(first.isEmpty()) {
                first.put(brr.get(k), 1);
            } else {
                if(first.containsKey(brr.get(k))) {
                    first.put(brr.get(k), first.get(brr.get(k)) +1);
                } else {
                    first.put(brr.get(k), 1);
                }
            }

        }

        for(int k=0;k < arr.size(); k++) {
            if(first.containsKey(arr.get(k))) {
                first.put(arr.get(k), first.get(arr.get(k)) -1);
            } else {
                extra.add(arr.get(k));
            }
        }

        for(Map.Entry<Integer, Integer> val: first.entrySet()) {
            if(val.getValue() > 0) {
                extra.add(val.getKey());
            }
        }

        return extra;


    }





    public static void main(String ar[]) {
        //System.out.println(howManyGames(20 ,3 ,6 ,80));
        List<Integer> a= List.of(203, 204 ,205, 206 ,207 ,208, 203, 204 ,205 ,206);
        List<Integer> b= List.of(203, 204, 204, 205 ,206 ,207 ,205 ,208, 203 ,206, 205 ,206 ,204);

        missingNumbers(a,b).forEach(x -> System.out.println(x));

    }
}
