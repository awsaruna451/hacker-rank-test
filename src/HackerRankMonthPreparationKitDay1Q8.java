import java.util.*;
import java.util.stream.Collectors;

public class HackerRankMonthPreparationKitDay1Q8 {

    public static String pangrams(String s) {
        // Write your code here
        Set<String> hashMap = new HashSet<>();

        for(int a = 0; a < s.length(); a++) {
            String b = String.valueOf(s.charAt(a)).toUpperCase();
            if (Optional.ofNullable(b.trim()).isPresent() && !b.trim().isEmpty()) {
                hashMap.add(b);
            }

        }
        if (hashMap.size() < 26) {
          return "not pangram" ;
        } else {
            return "pangram";
        }


    }

    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));

    }
}

