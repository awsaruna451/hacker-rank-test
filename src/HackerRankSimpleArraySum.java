import java.util.List;

public class HackerRankSimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here

        int sum = 0;
        for (int a=0; a < ar.size(); a++) {
            sum += ar.get(a);
        }

     return sum;
    }
}
