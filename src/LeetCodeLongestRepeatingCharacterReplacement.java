import java.util.*;
import java.util.stream.Collectors;

public class LeetCodeLongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];
        int maxCount = 0;
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            count[currentChar - 'A']++;
            maxCount = Math.max(maxCount, count[currentChar - 'A']);

            // If the number of characters to be replaced exceeds k, move the window's start
            if (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;

    }

    public static void main(String[] args) {
       System.out.println(characterReplacement("AABABBA",1));
    }
}
