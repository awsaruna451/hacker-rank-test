import java.net.SocketOptions;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HackerRankMakingAnagrams {
    public static int makeAnagram(String a, String b) {
        // Write your code here
      Map<String,Integer> getFirstString = getMapValues(a);
      Map<String,Integer> getSecond = getMapValues(b);
      int removeCCount = 0;
      for(Map.Entry<String,Integer> sv:getFirstString.entrySet()) {
          if (Optional.ofNullable(getSecond.get(sv.getKey())).isPresent()) {
              if (sv.getValue() != getSecond.get(sv.getKey())) {
                  removeCCount += Math.abs(sv.getValue()- getSecond.get(sv.getKey()));
                  getSecond.remove(sv.getKey());
              } else {
                  getSecond.remove(sv.getKey());
              }
          } else {
              removeCCount += sv.getValue();
          }
      }

        for(Map.Entry<String,Integer> sv:getSecond.entrySet()) {
            removeCCount += sv.getValue();
        }




        return removeCCount;
    }

    public static Map<String,Integer> getMapValues(String a) {
        Map<String,Integer> firstStringVal = new HashMap<>();
        for(int p =0; p < a.length(); p++) {
            String val = String.valueOf(a.charAt(p));
            if(!Optional.ofNullable(firstStringVal).isPresent()) {
                firstStringVal.put(val, 1);
            } else {
                if (firstStringVal.containsKey(val)) {
                    firstStringVal.put(val, firstStringVal.get(val) +1);
                } else {
                    firstStringVal.put(val, 1);
                }
            }
        }

        return firstStringVal;
    }

    public static void main(String ar[]) {

        System.out.println(makeAnagram("cde","abc"));
    }
}
