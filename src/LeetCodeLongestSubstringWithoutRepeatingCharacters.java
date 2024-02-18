import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class LeetCodeLongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> values = new HashSet<Character>();
        int a_point = 0;
        int b_point = 0;
        int max = 0;
        while (a_point < s.length()) {
            if(!values.add(s.charAt(a_point))) {
                values.remove(s.charAt(b_point));
                b_point++;
            } else {
                a_point++;
                max = Math.max(values.size(), max);
            }
        }

        return max;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
