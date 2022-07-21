import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HackerRankTwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        int s1Length = s1.length();
        int s2Length = s2.length();


        if (s1Length > s2Length) {
            return checkString(s2, s1);

        } else {
           return checkString(s1, s2);

        }


    }

    public static String checkString(String s1, String s2) {
        Map<String,Integer> strValue = new HashMap<>();

        for (int p = 0; p < s1.length(); p++) {
            strValue.put(s1.substring(p, p+1), p);

        }


        for (int k = 0; k < s2.length(); k++) {
            String c = s2.substring(k, k+1);
            if (strValue.containsKey(c)){
                return "YES";
            }


        }
        return "NO";
    }

    public static void main(String ar[]) {
        System.out.println(twoStrings("beetroot", "sandals"));
    }
}
