import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankCutTheSticks {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        int s = arr.size();
        List<Integer> sticks = new ArrayList<>();
        List<Integer> st = arr;

        sticks.add(s);
        while (s > 1) {
            int min = st.stream().mapToInt(x-> x).min().getAsInt();
             st = st.stream().filter(f -> f > min).map(p -> p -min).collect(Collectors.toList());


             s = st.size();
            if (s > 0) {
                sticks.add(s);
            }

        }

      return sticks;
    }

   public static void main(String ar[]) {
        System.out.println(cutTheSticks(List.of(8, 8, 14,10, 3, 5, 14, 12)));
   }
}
