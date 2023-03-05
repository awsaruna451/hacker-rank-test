import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HackerRankOrganizingContainersofBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        // Write your code here
        List<Integer> row = new ArrayList<>();
        List<Integer> colum = new ArrayList<>();
    int n = container.size();
        for(int x =0; x < n; x++) {
            for (int y = 0; y < n ; y++) {
                row.add(container.get(x).get(y));
                colum.add(container.get(y).get(x));
            }
        }

        Collections.sort(row);
        Collections.sort(colum);
        if (row.equals(colum)) {
            return "Possible";
        }

        return "Impossible";
    }

    public static void main(String ar[]) {

        List<Integer> a = List.of(0,2);
        List<Integer> b = List.of(1,1);

        List<List<Integer>> c = new ArrayList<>();
        c.add(a);
        c.add(b);


       System.out.println(organizingContainers(c));
    }
}
