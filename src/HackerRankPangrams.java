import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HackerRankPangrams {
    public static String pangrams(String s) {
        String isString ="not pangram";

        Set<String> st = new HashSet<>();
        String s1 = s.replaceAll("\\s","");
        for (int i =0; i < s1.length(); i++) {

            st.add(String.valueOf(s1.charAt(i)).toLowerCase());

            if (st.size() == 26) {
               isString = "pangram";
                break;
            }
        }



        // Write your code here

        return isString;

    }

    public static void main(String ar[]) {

        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
