import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCodeValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return  false;
        }

        Map<Character, Long> strOri = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> strT = t.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<Character, Long> pr: strOri.entrySet()) {
            if (strT.get(pr.getKey()) == null) {
                return false;
            } else if (strT.get(pr.getKey()) != pr.getValue()) {
                return false;
            }
        }

         return true;

    }

    public static boolean isAnagram1(String s, String t) {
        int original[] = new int[26];
        for(int x =0; x < s.length(); x++) {
            original[s.charAt(x) - 'a']++;
        }
        for(int x =0; x < t.length(); x++) {
            original[t.charAt(x) - 'a']--;
        }

        for(int x=0; x < original.length; x++) {
            if(original[x] != 0) {
                return false;
            }
        }

        return  true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram1("a","ab"));
    }
}
