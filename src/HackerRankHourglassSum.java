import java.util.ArrayList;
import java.util.List;

public class HackerRankHourglassSum {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
       int max = -100;
      for (int i =0 ; i < 4; i++) {
         List<Integer> a = arr.get(i);
         for (int p = 0; p <4; p++) {
             int y = a.get(p) + a.get(p + 1) + a.get(p + 2) + arr.get(i + 1).get(p+1) +arr.get(i + 2).get(p)
                     + arr.get(i + 2).get(p + 1) + arr.get(i + 2).get(p + 2);
             if (y > max) {
                 max = y;
             }

         }
      }

        return  max;

    }



    public static void main(String ar[]) {
        List row0 = List.of(1, 1, 1, 0, 0, 0);
        List row1 = List.of(0, 1, 0, 0, 0, 0);
        List row2 = List.of(1, 1 , 1, 0, 0, 0);
        List row3 = List.of(0, 0, 2, 4, 4, 0);
        List row4 = List.of(0, 0, 0, 2, 0, 0);
        List row5 = List.of(0, 0, 1, 2, 4, 0);
        List array = new ArrayList();
        array.add(row0);
        array.add(row1);
        array.add(row2);
        array.add(row3);
        array.add(row4);
        array.add(row5);
        System.out.println(hourglassSum(array));
    }
}
