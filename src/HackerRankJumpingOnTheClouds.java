import java.util.List;
import java.util.stream.Collectors;

public class HackerRankJumpingOnTheClouds {


    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
       List<Integer> filterValue = c.stream().filter(i -> i != 1).collect(Collectors.toList());
        Integer secoundCount = filterValue.size() -1;
        int j = 0;
        int count = 0;

        do {
            if (j != 0 && c.get(j) == 0) {
                count++;

            } else if (j != 0) {
                j--;
                if (c.get(j) == 0) {
                    count++;
                }
            }


            j = j + 2;
            if (j > (c.size()-1)) {
                j --;
            }

        } while (j < c.size());




        if (secoundCount < count) {
            count = secoundCount;
        }

        return count;

    }

    public static void main(String ar[]) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 0, 1, 0)));
    }

}
