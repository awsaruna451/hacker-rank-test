import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankNonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int arr[] = new int[k];
        Arrays.fill(arr, 0);

        for(int j=0; j < s.size(); j++) {
            arr[s.get(j)%k]++;
        }

        if(k %2 == 0) {
            arr[k/2] = Math.min(arr[k/2], 1);
        }

        int res = Math.min(arr[0], 1);

        for(int a=1; a <= k/2;a++) {
            res += Math.max(arr[a], arr[k-a]);
        }



        return res;
    }

    public static void main(String ar[]) {

        System.out.println(nonDivisibleSubset(13, List.of(582740017,954896345,590538156,298333230,859747706,155195851,331503493,799588305,164222042,563356693,80522822,432354938,652248359)));
    }

}
