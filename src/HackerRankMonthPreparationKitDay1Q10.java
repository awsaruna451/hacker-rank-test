import java.util.*;
import java.util.stream.Collectors;

public class HackerRankMonthPreparationKitDay1Q10 {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        Set<Integer> list = new HashSet<>();
        for(int i =0; i < s.size(); i++) {
            int c = 0;
            int sum = 0;
            for (int j =i ; j <s.size(); j++) {
                sum += s.get(j);
                c++;
                if (c == m) {
                    if (sum == d && list.add(j)) {
                        count++;
                    } else {
                        list = new HashSet<>();
                    }
                    sum = 0;
                }



            }



        }
      return count;
    }



    public static void main(String[] args) {
     //   System.out.println(twoArrays(5, List.of(1, 2 ,2 ,1), List.of(3, 3, 3, 4)));
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));
       // System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
        System.out.println(birthday(List.of(2,2,1,3,2), 4, 2));

    }
}

