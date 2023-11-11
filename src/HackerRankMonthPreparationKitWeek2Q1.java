import java.util.*;

public class HackerRankMonthPreparationKitWeek2Q1 {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> socks = new HashMap<>();
        for (int x =0; x < n ; x++) {

            if (!Optional.ofNullable(socks).isPresent()) {
                socks.put(ar.get(x), 1);
            } else {
                if (socks.containsKey(ar.get(x))) {
                    socks.put(ar.get(x), socks.get(ar.get(x)) +1);
                } else {
                    socks.put(ar.get(x), 1);
                }
            }
        }
        int count = 0;

        for (Integer s :socks.values()) {
            if (s >= 2) {
               int a = s/2;
               count += a;
                //System.out.println(a);
            }
        }
    return  count;
    }



    public static void main(String[] args) {
     //   System.out.println(twoArrays(5, List.of(1, 2 ,2 ,1), List.of(3, 3, 3, 4)));
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));
       // System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
       System.out.println(sockMerchant(9,List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));

    }
}

