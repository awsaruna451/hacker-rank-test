import java.util.HashMap;
import java.util.Map;

public class LeetCodeRomanToInteger {

    public  static int romanToInt(String s) {
        Map<String,Integer> romanVal = new HashMap<>();
        romanVal.put("I", 1);
        romanVal.put("V", 5);
        romanVal.put("X", 10);
        romanVal.put("L", 50);
        romanVal.put("C", 100);
        romanVal.put("D", 500);
        romanVal.put("M", 1000);
        romanVal.put("IV", 4);
        romanVal.put("IX", 9);
        romanVal.put("XL", 40);
        romanVal.put("XC", 90);
        romanVal.put("CD", 400);
        romanVal.put("CM", 900);
        int tot = 0;
        boolean last = false;
        for(int i=0; i < s.length(); i ++) {
            if (i != 0) {
                String val = String.valueOf(s.charAt(i - 1)) + String.valueOf(s.charAt(i));
                if (romanVal.containsKey(val)) {
                    tot += romanVal.get(val);
                    tot -=romanVal.get(String.valueOf(s.charAt(i - 1)));
                } else {
                    tot += romanVal.get(String.valueOf(s.charAt(i)));
                }
            } else {
                tot += romanVal.get(String.valueOf(s.charAt(i)));
            }

        }
        return tot;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
