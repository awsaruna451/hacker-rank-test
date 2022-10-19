import java.util.HashMap;
import java.util.Map;

public class HackerRankUtopianTree {

    public static int utopianTree(int n) {
        // Write your code here
        Map<Integer, Integer> growth = new HashMap<>();
        for (int a = 0; a <=n ; a++) {

            if (a == 0) {
               growth.put(0, 1);
            } else if( a == 1) {
                growth.put(1, 2);
            } else {
                if (a % 2 == 0) {
                    growth.put(a, growth.get(a-1) +1);
                } else {
                    growth.put(a, growth.get(a-1) *2);
                }
            }

        }
      return growth.get(n);
    }
    public static void main(String ar[]) {
        System.out.println(utopianTree(4));
    }
}
