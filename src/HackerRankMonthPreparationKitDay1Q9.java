import java.util.*;
import java.util.stream.Collectors;

public class HackerRankMonthPreparationKitDay1Q9 {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here


        List<Integer> xvalue = new ArrayList<>();
        for (int i=0; i < A.size(); i++) {
            int x = k- A.get(i);
            xvalue.add(x);

        }
        Collections.sort(xvalue);
        List <Integer> b = B.stream().sorted().collect(Collectors.toList());

        for (int l = 0; l < b.size(); l++) {
            if (b.get(l) >= xvalue.get(l)) {
                continue;
            } else {
                return "NO";
            }
        }




       return "YES";
    }


    public static void main(String[] args) {
        System.out.println(twoArrays(5, List.of(1, 2 ,2 ,1), List.of(3, 3, 3, 4)));
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));
       // System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }
}

