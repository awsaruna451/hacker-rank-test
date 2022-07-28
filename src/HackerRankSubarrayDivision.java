import java.util.List;

public class HackerRankSubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i=0; i < s.size();i++) {

            int k = 0;
            int mValue = 0;
            while (k < m && (k+i) < s.size()) {

                   mValue+= s.get(k+i);


                k++;
            }
            if (d == mValue) {
                count++;
            }
        }
    return count;
    }
    public static void main(String ar[]) {
        System.out.println(birthday(List.of(4), 4, 1));
    }
}
