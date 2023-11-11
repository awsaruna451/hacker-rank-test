import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class HackerRankACMICPCTeam {

    public static List<Integer> acmTeam(List<String> topic) {
        // Write your code here
        Map<Integer, Integer> coun = new HashMap<>();
        int teamCount = 0;
        for(int x = 0; x < topic.size();x++) {
            char[] a=topic.get(x).toCharArray();
            for(int y = x+1; y < topic.size(); y++) {
                char[] b=topic.get(y).toCharArray();
                int countSum = 0;
                for(int z =0; z< b.length;z++) {
                    int va = Integer.parseInt(String.valueOf(b[z])) + Integer.parseInt(String.valueOf(a[z]));
                    if (va >= 1) {
                        countSum++;
                    }
                }
                coun.put(teamCount++,countSum);

            }

        }

        int maxValue = 0, team=0;

        for(Map.Entry<Integer,Integer> values:coun.entrySet()) {

            if(values.getValue() >= maxValue) {
                if (maxValue == values.getValue()) {
                    team++;
                } else {
                    team = 1;
                }
                maxValue = values.getValue();


            }



        }

        List<Integer> result = new ArrayList<>();
        result.add(maxValue);
        result.add(team);

        return result;


    }

    public static void main(String[] args) {
      List<Integer> p = acmTeam(List.of("10101","11100","11010","00101"));
        System.out.println(p);
    }

}
