import java.util.List;
import java.util.stream.Collectors;

public class HackerRankMarkAndToys {

    public static int maximumToys(List<Integer> p, int k) {

        List<Integer> prices = p.stream().filter(v -> v <= k).collect(Collectors.toList());
        // Write your code here
        int maxCount = 0;
       for (int i = 0; i < prices.size(); i++) {
           int price = prices.get(i);
           int j = 0;
           int maxToys = 0;
           while(price < k && j <= i) {

                   price += prices.get(j);
                   maxToys ++;

               j++;
           }
           if (maxToys > maxCount) {
               maxCount = maxToys;
           }

       }
      return maxCount;
    }

    public static void main(String ar[]) {
        System.out.println(maximumToys(List.of(1, 2,3,4), 7));


    }

}
