import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankSamandsubstrings {
    private static final int MOD = 1000000007;
    public static long substrings(String numStr) {

        int n = numStr.length();
        long[] dp = new long[n];
        dp[0] = numStr.charAt(0) - '0';
        long totalSum = dp[0];

        for (int i = 1; i < n; i++) {
            int digit = numStr.charAt(i) - '0';
            dp[i] = ((i + 1) * digit + 10 * dp[i - 1]) % MOD;
            totalSum = (totalSum + dp[i]) % MOD;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(substrings("972698438521"));
    }

}
