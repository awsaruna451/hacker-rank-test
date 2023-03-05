import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class LeetCodeLongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        } else if(s.trim().isEmpty()) {
            return 1;
        }
          else {

            int max = 0;
            for (int x = 0; x < s.length(); x++) {
                int i = x;
                Set vls = new HashSet<>();
                while (i < s.length()) {
                    if (!vls.add(s.charAt(i))) {
                        break;
                    }

                    i++;
                }
                if (max < vls.size()) {
                    max = vls.size();
                }

            }

            return max;
        }

    }

    public static void main(String[] args) {
       /* int[] x = new int[]{1,2,3,1};*/
        System.out.println((lengthOfLongestSubstring("pwwkew")));
    }
}
