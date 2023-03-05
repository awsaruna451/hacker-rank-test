import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTagContentExtractor {

    public static void exactor(String line) {
        // Write your code here
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(line);

        if (m.find()) {
            System.out.println(m.group());
        }

    }
    public static void main(String[] args) {
       // check("I love Love to To tO code");
        //System.out.println(lonelyinteger(List.of(1,2,3,4,3,2,1)));

        exactor("fdfd<h2>fg</h2>");

    }
}

