import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HackerRankTwoCharacters {
    private static final int MOD = 1000000007;
    public static int alternate(String s) {
        // Write your code here
        char ls[] = s.toCharArray();
        Set<String> val = s.chars().distinct().mapToObj(ch -> String.valueOf(ch)).collect(Collectors.toSet());

        for(int i=0; i< val.size(); i++) {
            for(int j =i+1; j < val.size();j++) {


            }
        }
    return 1;
    }

    private void checkCharacter(String a, String b, char ls[]) {


    }

    public static void main(String[] args) {
      //  System.out.println(substrings("972698438521"));
    }

}
