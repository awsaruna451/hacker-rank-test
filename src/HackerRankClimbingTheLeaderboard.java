import java.util.*;

public class HackerRankClimbingTheLeaderboard {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        TreeMap<Integer, Integer> ranks = new TreeMap<>();
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

    public static int playerRank(TreeMap<Integer, Integer> p, int score) {
        int rank = 0;

        if (score >= p.firstEntry().getValue()) {
            rank = 1;
        } else if (score < p.lastEntry().getValue()) {
            rank = p.size() +1;

        } else {
            for (Map.Entry<Integer, Integer> pl : p.entrySet()) {

                if (score <= pl.getValue()) {
                    if (score < pl.getValue()) {
                        rank = pl.getKey() +1;
                    } else {
                        rank = pl.getKey();
                    }
                }

                else {
                    continue;
                }
            }
        }
        return rank;
    }



    public static void main(String ar[]) {
        System.out.println(climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10), List.of(5, 25, 50, 120)));
    }
}
