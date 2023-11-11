import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankInsertionSortPart1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        List<List<Integer>> val = new ArrayList<>();
        int k = arr.get(n-1);

        boolean valueGreater= true;
        for(int i=n-2; i >=0 ; i--) {

            if (arr.get(i) > k) {
                ArrayList<Integer> valp = new ArrayList<>(arr);
                valp.add(i+1,arr.get(i) );
                valp.remove(n);
                val.add(valp);
            } else {
                ArrayList<Integer> valp = new ArrayList<>(arr);
                valp.add(i+1, k);
                valueGreater = false;
                valp.remove(n);
                val.add(valp);
                break;

            }

        }

        if (valueGreater) {
            ArrayList<Integer> valp = new ArrayList<>(arr);
            valp.add(0, k);
            valp.remove(n);
            val.add(valp);
        }

        for(int i = 0; i < val.size(); i++) {
            List<Integer> kp = val.get(i);
            for(int j = 0; j < kp.size(); j++) {
                System.out.print(kp.get(j) + " ");
            }
            System.out.println("");
        }


    }

    public static void main(String[] args) {
        insertionSort1(5,List.of(2,4,6,8,1));
    }

}
