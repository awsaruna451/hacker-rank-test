import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankClimbingTheLeaderboard {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        Map<Integer, Integer> ranks = new HashMap<>();
        int rankCount = 0;
        for (int i =0; i < ranked.size(); i++) {

            if (ranked == null || ranked.isEmpty()) {
                rankCount++;
                ranks.put(rankCount, ranked.get(i));
            } else {
                if (!ranks.containsValue(ranked.get(i))) {
                    rankCount++;
                    ranks.put(rankCount, ranked.get(i));
                }
            }
        }
        List<Integer> playerRank = new ArrayList<>();

        for (int j = 0 ; j < player.size(); j++) {
            playerRank.add(playerRank(ranks, player.get(j)));
           
        }

        return playerRank;

    }

    public static int playerRank(Map<Integer, Integer> p, int score) {
        int rank = 0;
        for(Map.Entry<Integer, Integer> pl: p.entrySet()) {
            if (pl.getValue() <= score) {
                rank = pl.getKey();
                break;
            } else {
                continue;
            }
        }
        if (rank == 0) {
            rank = p.size() +1;
        }
        return rank;
    }



    public static void main(String ar[]) {
        System.out.println(climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10), List.of(5, 25, 50, 120)));
    }
}
