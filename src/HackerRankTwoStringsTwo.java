import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HackerRankTwoStringsTwo {

    public static String twoStrings(String s1, String s2) {

        Set<String> values = new HashSet<>();
        for(int j = 0; j< s1.length(); j++) {
            values.add(String.valueOf(s1.charAt(j)));
        }

        for(int i =0; i< s2.length(); i++) {

            if(values.contains(String.valueOf(s2.charAt(i)))) {
                return "YES";
            }

        }


        return "NO";



    }
    public static String twoStringsJava8(String s1, String s2) {


        Set<String> values = s1.chars().mapToObj(a -> String.valueOf((char) a)).collect(Collectors.toSet());
        boolean val = s2.chars().mapToObj(b -> String.valueOf((char) b)).anyMatch(values::contains);




        return val? "YES":"NO";



    }



    public static void main(String ar[]) {
        System.out.println(twoStringsJava8("wouldyoulikefries", "abcabcabcabcabcabc"));
    }
}
