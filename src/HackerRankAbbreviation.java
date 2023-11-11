import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HackerRankAbbreviation {
    public static String abbreviation(String a, String b) {
        // Write your code here

        char [] pureVal = a.toCharArray();
        char [] upperVal = a.toUpperCase().toCharArray();

        for(int i=0; i < b.length(); i++) {
            String char1 = String.valueOf(b.charAt(i));

            for(int k = 0; k < upperVal.length; k++) {

                if (char1.equals(String.valueOf(upperVal[k])) && k >=i) {
                    pureVal[k] = b.charAt(i);
                    break;
                }

            }
        }
       StringBuilder sb = new StringBuilder();
        for(int j=0; j < pureVal.length; j++) {
            String s = String.valueOf(pureVal[j]);

            if (s.matches("[A-Z]+")){
                sb.append(s);
            }

        }

        if (sb.toString().equals(b)) {
            return "YES";
        }



        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(abbreviation("wZPRSZwGIMUAKONSVAUBUgSVPBWRSTJZECxMTQXXA","ZPRSZGIMUAKONSVAUBUSVPBWRSTJZECMTQXXA"));
    }

}
