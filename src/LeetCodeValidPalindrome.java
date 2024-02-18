import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCodeValidPalindrome {

    public static boolean isPalindrome(String s) {

        if(s == null) {
            return false;
        }

        if(s.trim().length() < 2) {
            return true;
        }

        if(s.isEmpty()) {
            return true;
        }

        int i = 0;

        List<String> lis = new ArrayList<>();

        while (i < s.length()) {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                lis.add(String.valueOf(s.charAt(i)).toLowerCase());
            }
            i++;
        }

        int len = lis.size()/2;

        for(int j =0; j < len; j++) {
            if(!lis.get(j).equals(lis.get(lis.size()-1-j)) ) {
                return false;
            }
        }

        return  true;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }
}
