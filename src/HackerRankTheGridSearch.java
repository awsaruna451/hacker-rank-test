import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HackerRankTheGridSearch {
    public static String gridSearch(List<String> G, List<String> P) {
        // Write your code here
        int p = 0;
        for(int i=0; i < G.size(); i++) {
            String inp = G.get(i);

            Pattern pattern = Pattern.compile(P.get(p));
            Matcher matcher = pattern.matcher(inp);
            if (p < P.size()) {
                while (matcher.find()) {
                 p++;
                 break;
                }
            }

        }
        if (p == P.size()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String ar[]) {

        //System.out.println(stones(3,1,2));
    }
}
