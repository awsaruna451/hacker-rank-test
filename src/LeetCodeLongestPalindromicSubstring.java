import java.util.ArrayList;
import java.util.List;

public class LeetCodeLongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

      if(s.length() <2) {
          return "";

      } else if(s.length() == 2) {
          if(s.charAt(0) != s.charAt(1)) {
              return "";
          } else {
              return s;
          }
      } else {
          long count = s.chars().mapToObj(e -> String.valueOf(e)).distinct().count();
          if (count < 2) {
              return s;
          }

          String maxVal = "";

          for(int i = 1; i <= s.length()-1; i++) {
              int left= i;
              int right = i;
              String val = String.valueOf(s.charAt(i));
              while(left > 0 && right < s.length()-1 ) {
                  left--;
                  right++;
                  if (s.charAt(left) == s.charAt(right)) {
                      val = s.charAt(left) + val + s.charAt(right);
                  }

              }
              if(maxVal.length() < val.length()) {
                  maxVal = val;
              }

              if (s.charAt(i-1) ==s.charAt(i)) {
                  String twoValue = s.substring(i-1, i+1);
                  if(maxVal.length() < twoValue.length()) {
                      maxVal = twoValue;
                  }
              }


          }
          return maxVal;
      }




    }
    public static String longestPalindrome2(String s) {

      if(s.length() <2) {
          return s;

      } else if(s.length() == 2) {
          if(s.charAt(0) != s.charAt(1)) {
              return "";
          } else {
              return s;
          }
      } else {

          String maxVal = "";

          for(int i = 0; i <= s.length()-2; i++) {
             String value1 = maxpalindram(s, i, i);
             String value2 = maxpalindram(s, i, i+1);
             if (value1.length() > value2.length()) {
                 value2 = value1;
             }

             if (maxVal.length() < value2.length()) {
                 maxVal = value2;
             }

          }
          return maxVal;
      }




    }

    public static String maxpalindram(String s, int left, int right) {

        String palndrim = "";

        while (left >= 0 && right <= s.length()-1) {

            if(s.charAt(left) == s.charAt(right)) {
                palndrim = s.substring(left, right+1);
            } else {
                break;
            }
            left--;
            right++;

        }

        return palndrim;

    }



    public static void main(String[] args) {

       // System.out.println(longestPalindrome2("babaddtattarrattatddetartrateedredividerb"));
        System.out.println(longestPalindrome2("ccd"));

    }
}
