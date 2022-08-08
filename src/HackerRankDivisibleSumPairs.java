import java.util.List;

public class HackerRankDivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int p = 0; p< ar.size();p++){

            int x = p + 1;
            while ((x+1) <= n) {
                int sum = ar.get(p) + ar.get(x);
                if ( sum % k == 0) {
                    count++;
                }
                x++;

            }

        }
     return count;
    }
    public static void main(String ar[]) {
        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }
}
