import java.util.*;

public class HackerRankFlatlandSpaceStations {

    static int flatlandSpaceStations(int n, int[] c) {

        int disv[] = new int[n];

        if (n == c.length) {

            return 0;

        } else {

            for (int i = 0; i < n; i++) {

                int dis = n;

                    for (int j = 0; j < c.length; j++) {

                        if (i == c[j]) {
                            dis = 0;
                            break;
                        } else {
                            if (Math.abs(i - c[j]) < dis) {
                                dis = Math.abs(i - c[j]);
                            }

                        }
                    }
                    disv[i] = dis;


            }

            return Arrays.stream(disv).reduce(Integer.MIN_VALUE, Integer::max);
        }


    }


    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(3, new int[]{1}));
    }

}
