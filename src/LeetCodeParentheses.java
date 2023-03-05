import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeetCodeParentheses {

    public static String  removeOuterParentheses(String s) {
        int pCount = 0;
        int openPCount = 0;
        List<String> paranList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        while(pCount < s.length()) {
            String paranT = s.charAt(pCount) +"";
            if (paranT.equals("(")) {
                builder.append("(");
                openPCount++;
            }

            if (paranT.equals(")")) {
                openPCount--;
                builder.append(")");
            }

            if (openPCount == 0) {
                paranList.add(builder.toString());
                builder = new StringBuilder();
            }

            pCount++;
        }

        StringBuilder p = new StringBuilder();
                paranList.stream().map(l -> {
           return l.substring(1, l.length()-1);
        }).forEach( l -> {
            p.append(l);
                }

        );
   return p.toString();
    }

    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("(()())(())"));
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
