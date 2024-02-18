import java.util.*;
import java.util.stream.Collectors;

public class HackerRankHighestValuePalindrome {

    public static String highestValuePalindrome(String s, int n, int k) {
        // Write your code here
        int max = 9;
        String palandrim = "-1";

        List<Integer> values = s.chars().mapToObj(p -> p).collect(Collectors.toList());


        Map<Integer, Integer> x = new HashMap<>();
        for(int i=0; i < n/2 ; i++) {
            int l  = n/2;
            int left = Integer.parseInt(String.valueOf(s.charAt(l)));
            int right = Integer.parseInt(String.valueOf(s.charAt(n-1-l)));
            if( left != right) {
               x.put(l, left);
               x.put((n-1-l), right);
            }
        }

        if(x.size()-1 > k) {
            return "-1";
        } else {
            for(int i= 9; i > 0; i--) {
                for(Map.Entry<Integer, Integer> y : x.entrySet()) {
                    values.remove(y.getKey());
                    values.add(y.getKey(), i);
                }
                String pland = isPlandrim(values);
                if(!pland.equals("NO")) {
                    palandrim = pland;
                   break;
                }

            }

        }

     return palandrim;

    }

    public static String isPlandrim(List<Integer> v) {

       int left = 0;
       int right = v.size()-1;
       StringBuilder builder1 = new StringBuilder();

       while (left < right) {
           if(v.get(left) != v.get(right)) {
               return "NO";
           }

           builder1.append(v.get(left));

           left++;
           right--;
       }

       return builder1.reverse().toString() + builder1.toString();

    }


    public static void main(String[] args) {
        System.out.println(highestValuePalindrome("3943", 4, 1));
    }

}
