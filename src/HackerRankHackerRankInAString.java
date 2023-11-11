import java.util.List;

public class HackerRankHackerRankInAString {

    public static String hackerrankInString(String s) {
        // Write your code here
        String hak= "hackerrank";
        StringBuilder sb = new StringBuilder();
        int x = 0;

        for(int a=0; a < hak.length();a++) {
            String p = String.valueOf(hak.charAt(a));

            while(x < s.length()) {
                String l = String.valueOf(s.charAt(x));
               x++;
                if (p.equals(l)) {
                    sb.append(l);
                    break;
                }
            }


        }
        if (sb.toString().equals(hak)) {
            return "YES";
        }
       return "NO";

    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("hackerworld"));

        //System.out.println(abbreviation("wZPRSZwGIMUAKONSVAUBUgSVPBWRSTJZECxMTQXXA","ZPRSZGIMUAKONSVAUBUSVPBWRSTJZECMTQXXA"));
    }

}
