import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerRankHalloweenSale {


    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        int tot = 0;
        int tot1 = 0;
        while (tot <= s) {
           if(tot1 == 0) {
                tot1 =p;

            } else {
                tot1 = tot1 - d;
            }
            if (tot1 <= m) {
                tot1 = m;
            }

            tot += tot1;
            if (tot > s) {
                break;
            }
            count++;

        }
      return  count ;
    }





    public static void main(String ar[]) {
        System.out.println(howManyGames(20 ,3 ,6 ,80));

    }
}
