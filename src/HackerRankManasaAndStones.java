import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HackerRankManasaAndStones {
    public static List<Integer> stones(int n, int a, int b) {
        // Write your code here

        Set<Integer> values = new HashSet<>();

        for(int i=0; i<n ; i++) {
            int sum = i *a + (n-1-i) *b;
            values.add(sum);
        }

       return values.stream().sorted().collect(Collectors.toList());

    }

    public static void main(String ar[]) {

        System.out.println(stones(3,1,2));
    }
}
