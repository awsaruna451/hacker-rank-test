import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankBreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int scoreLastMax = 0;
        int scoreLastMin = 1000000000;
        List<Integer> maxScore = new ArrayList<>();
        List<Integer> lowScore = new ArrayList<>();


        for (int x = 0; x < scores.size(); x++) {

            if (scores.get(x) >= scoreLastMax) {
                maxScore.add(scores.get(x));
                scoreLastMax = scores.get(x);
            } else {
                maxScore.add(scoreLastMax);
            }
           if (scores.get(x) <= scoreLastMin) {
                lowScore.add(scores.get(x));
                scoreLastMin = scores.get(x);
            } else {
               lowScore.add(scoreLastMin);
           }

        }
        List<Integer> max = maxScore.stream().distinct().collect(Collectors.toList());
        List<Integer> low = lowScore.stream().distinct().collect(Collectors.toList());
        List<Integer> finalVal = new ArrayList<>();
        max.remove(scores.get(0));
        low.remove(scores.get(0));
        finalVal.add(max.size());
        finalVal.add(low.size());


       return finalVal;

    }
    public static void main(String ar[]) {
        System.out.println(breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }
}
