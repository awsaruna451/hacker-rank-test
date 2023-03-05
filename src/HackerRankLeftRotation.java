import java.util.ArrayList;
import java.util.List;

public class HackerRankLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> newList = new ArrayList<>();
        List<Integer> oldList = new ArrayList<>();
        for(int i =0; i < a.size(); i++) {
            if (i < d) {
                newList.add(a.get(i));
            } else {
                oldList.add(a.get(i));
            }
        }

        oldList.addAll(newList);
      return oldList;
    }

    public static void main(String ar[]) {

        List<Integer> inputList = List.of(1, 2, 3, 4, 5);

        System.out.println(rotLeft(inputList, 4));
    }
}
