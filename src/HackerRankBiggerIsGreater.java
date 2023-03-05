import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HackerRankBiggerIsGreater {
    public static String biggerIsGreater(String w) {
        // Write your code here

        boolean isBigger = false;

        String biggerString = "";

        for(int x= w.length()-1; x >= 1 ; x--) {
            if(w.charAt(x) > w.charAt(x-1) ) {
                isBigger = true;

                biggerString = w.substring(0, x-1) + makeCharacters(w.substring(x, w.length()), w.substring(x-1, x));

                break;
            }
        }
        if (!isBigger) {
            return "no answer";
        } else {
            return biggerString;
        }


    }

    public static String makeCharacters(String p, String shiftValue) {
        StringBuilder bf2 = new StringBuilder();

        if (p.length() == 1) {
            bf2.append(p).append(shiftValue);
        } else {

            Map<String, String> chr = new TreeMap<>();
            for (int y = 0; y < p.length(); y++) {
                chr.put(p.charAt(y) + "", p.charAt(y) + "");
            }
            StringBuilder bf = new StringBuilder();

            for (Map.Entry v : chr.entrySet()) {
                bf.append(v.getKey());
            }
            bf.reverse();
            String last = bf.toString().substring(bf.length() - 1, bf.length());

            bf2.append(last);
            bf2.append(bf.toString().substring(0, bf.length() - 1));
            bf2.append(shiftValue);
        }
      return bf2.toString();
    }

    public static void main(String ar[]) {

        System.out.println(biggerIsGreater("dkhc"));
    }
}
