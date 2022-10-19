import java.util.Comparator;
import java.util.List;

public class HackerRankTheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here

        int maxVal = height.stream().max(Comparator.naturalOrder()).get();

        if (k >= maxVal) {
            return 0;
        } else {
            return  maxVal-k;
        }

    }

    public static void main(String ar[]) {
        System.out.println(hurdleRace(4, List.of(1, 6, 3, 5, 2)));
    }
}
