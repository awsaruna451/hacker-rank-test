import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeBestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int maxPrice = 0, buy = prices[0];

        for(int a = 1; a < prices.length; a++) {

             if (buy > prices[a]) {
                 buy = prices[a];
             } else if (prices[a] - buy > maxPrice) {
                 maxPrice = prices[a] - buy;
             }


        }

        return maxPrice;

    }



    public static void main(String[] args) {
        int[] x = new int[]{7,1,5,3,6,4};

        System.out.println(maxProfit(x));
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
