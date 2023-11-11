import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRankPickingNumbers {
    private static final int MOD = 1000000007;
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> subArray = new ArrayList<>();
        int maxSubarray = 0;
        Collections.sort(a);

        for(int i =0; i <a.size()-1; i++) {
            int val = a.get(i);
            subArray.add(val);

            for (int j =i+1; j < a.size(); j++) {
                if (Math.abs(val-a.get(j)) <= 1) {
                    subArray.add(a.get(j));
                }
            }

            if (subArray.size() > maxSubarray) {
                maxSubarray = subArray.size();
            }

            subArray = new ArrayList<>();

        }

        return maxSubarray;

    }

    public static void main(String[] args) {
        List<Integer> sp = new ArrayList<>(List.of(4 ,4,4));
        System.out.println(pickingNumbers(sp));
    }

}
