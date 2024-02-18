import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCodeLongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        List<String> val = new ArrayList<>();
        int wordCount = 0;
        String start= "";

        for(int i=0; i< strs.length; i++) {
            String x = strs[i];

            if(i ==0) {
                start= x;
                wordCount = x.length();

                val = x.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());
            } else {
                int count = 0;
                for(int y=0; y< x.length();y++) {
                    String p = String.valueOf(x.charAt(y));
                    if (val.size() > y && val.get(y).equals(p) ){
                        count++;
                    } else {
                        break;
                    }
                }

                if (count < wordCount) {
                    wordCount = count;
                }

            }
        }

        if (wordCount > 0) {
            start = start.substring(0, wordCount);
        } else {
            start = "";
        }

        return start;

    }



    public static void main(String[] args) {
        String ar[] = new String[] {"cir","car"};
        System.out.println(longestCommonPrefix(ar));
    }
}
