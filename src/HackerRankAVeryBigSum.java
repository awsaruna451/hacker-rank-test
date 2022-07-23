import java.util.List;

public class HackerRankAVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (int a=0; a < ar.size(); a++) {
            sum += ar.get(a);
        }

         return sum;
    }

    public static void main(String ar[]) {
        System.out.println(aVeryBigSum(List.of(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L)));
    }

}
