import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankAnagram {
    public static int anagram(String s) {
        // Write your code here
        if (s.length() %2 == 0) {
            String a1 = s.substring(0, s.length() / 2);
            String b1 = s.substring(s.length() / 2, s.length());
            List<String> sb = new ArrayList<>();

            for (int x = 0; x < a1.length(); x++) {
                String p = a1.charAt(x) + "";
                sb.add(p);
            }

            for (int x = 0; x < b1.length(); x++) {
                String p = b1.charAt(x) + "";
                sb.remove(p);
            }

            // sb.values().stream().mapToInt(z -> z).sum();

            return sb.size();
        } else {
            return -1;
        }
    }

    public static void main(String ar[]) {

        System.out.println(anagram("xaxbbbxx"));
    }
}
