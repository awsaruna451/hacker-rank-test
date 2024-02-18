import java.util.ArrayList;
import java.util.List;

public class LeetCodeGroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();

        for(int x=0; x < strs.length; x++) {
            ArrayList<String> re = new ArrayList<>();
            int wd[] = new int[26];
            String c = strs[x];
            re.add(c);
            for(int a=0; a < c.length(); a++) {
                wd[c.charAt(a)-'a']++;
            }

            for(int g=x+1; g < strs.length; g++) {
                int bx[] = wd;
                String l = strs[g];
                for(int d = 0; d < l.length(); d++ ) {
                    bx[l.charAt(d)-'a']--;
                }

                boolean val = true;

                for(int n=0; n < bx.length; n++) {
                    if( bx[n] != 0) {
                       val = false;
                    }
                }

                if (true) {
                    re.add(l);
                }

            }

            res.add(re);

        }

     return res;
    }



    public static void main(String[] args) {

        String ar[] = new String[]{"eat","tea","tan","ate","nat","bat"};

        List<List<String>> pr = groupAnagrams(ar);

     //  System.out.println(p);
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
