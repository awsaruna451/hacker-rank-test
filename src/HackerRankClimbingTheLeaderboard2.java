import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerRankClimbingTheLeaderboard2 {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        List<Integer> playerRank = new ArrayList<>();
        ranked = ranked.stream().distinct().collect(Collectors.toList());
        for (int j = 0 ; j < player.size(); j++) {
            int score = player.get(j);
            if (ranked.get(0) <= score) {
                playerRank.add(1);
            }else if(ranked.get(ranked.size()-1) >= score) {
                if (ranked.get(ranked.size()-1) == score) {
                    playerRank.add(ranked.size());
                } else {
                    playerRank.add(ranked.size() + 1);
                }
            }
            else {
                playerRank.add(playerRank(ranked, player.get(j), 0, ranked.size()-1));
            }
        }
        return playerRank;

    }
    public static int playerRank(List<Integer> ranked, int score, int n, int last) {
        int rank = 0;
        int l = (n + last)/2;
        if (ranked.get(l) >= score) {
            if (ranked.get(l) == score) {
                return l + 1;
            } else if (ranked.get(l) > score && score > ranked.get(l + 1)) {
                return l + 2;
            } else {
                return playerRank(ranked, score, l+1, last);
            }
        } else {
          if (ranked.get(l) < score && score <= ranked.get(l - 1)) {
                return l;
            } else {
                return playerRank(ranked, score, 0, l);
            }
        }


       // return rank;
    }



    public static void main(String ar[]) {
  /*      String p = "5 5 6 14 19 20 23 25 29 29 30 30 32 37 38 38 38 41 41 44 45 45 47 59 59 62 63 65 67 69 70 72 72 76 79 82 83 90 91 92 93 98 98 100 100 102 103 105 106 107 109 112 115 118 118 121 122 122 123 125 125 125 127 128 131 131 133 134 139 140 141 143 144 144 144 144 147 150 152 155 156 160 164 164 165 165 166 168 169 170 171 172 173 174 174 180 184 187 187 188 194 197 197 197 198 201 202 202 207 208 211 212 212 214 217 219 219 220 220 223 225 227 228 229 229 233 235 235 236 242 242 245 246 252 253 253 257 257 260 261 266 266 268 269 271 271 275 276 281 282 283 284 285 287 289 289 295 296 298 300 300 301 304 306 308 309 310 316 318 318 324 326 329 329 329 330 330 332 337 337 341 341 349 351 351 354 356 357 366 369 377 379 380 382 391 391 394 396 396 400";
        String []a= p.split(" ");
        List<Integer> s = Arrays.stream(a).map(g -> Integer.parseInt(g)).collect(Collectors.toList());*/



        System.out.println(climbingLeaderboard(List.of(100, 100, 50, 40, 40, 20, 10), List.of(5, 25, 50, 120)));
       /* System.out.println(climbingLeaderboard(List.of(295, 294, 291, 287, 287, 285, 285, 284, 283, 279, 277, 274, 274 ,271, 270, 268, 268, 268, 264, 260, 259, 258, 257 ,255, 252, 250, 244, 241, 240, 237, 236, 236, 231, 227, 227, 227, 226, 225, 224, 223, 216,
                212, 200, 197, 196, 194 ,193, 189, 188 ,187, 183, 182 ,178, 177, 173, 171 ,169, 165, 143, 140, 137, 135, 133, 130, 130 ,130, 128, 127, 122, 120, 116, 114 ,113, 109, 106, 103, 99, 92, 85, 81, 69, 68, 63, 63, 63, 61, 57, 51, 47, 46 ,38, 30, 28 ,25, 22, 15, 14, 12, 6, 4), s));
*/    }
}
