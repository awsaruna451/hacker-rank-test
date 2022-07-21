import java.util.ArrayList;
import java.util.List;

public class HackerRankCompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int bob = 0;
        int alice = 0;
        List<Integer> sum = new ArrayList<>();
        for (int i=0; i < a.size();i++) {
            if (a.get(i) > b.get(i)) {
               alice++;
            } else if(b.get(i) > a.get(i)) {
                bob++;
            } else {
                continue;
            }
        }
        sum.add(alice);
        sum.add(bob);

     return sum;
    }

    public static void main(String ar[]) {
        System.out.println(compareTriplets(List.of(17,28,30), List.of(99,16,8)));
    }

}
