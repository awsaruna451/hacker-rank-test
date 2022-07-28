import java.util.List;

public class HackerRankBetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
       int initial = maxA(a);
       int last = minB(b);
        int x = initial;
        int count = 0;

      while (x <= last) {
          boolean aValue =  true;

          for(int p =0; p < a.size(); p++) {

              if (! (x % a.get(p) == 0)) {
                  aValue = false;
                  break;
              }
          }
          boolean bValue =  true;
          for(int p =0; p < b.size(); p++) {

              if (! ( b.get(p) % x == 0)) {
                  bValue =  false;
                  break;
              }
          }
          if (aValue && bValue) {
              count++;
          }
          x++;
      }
      return count;
    }

    public static int maxA(List<Integer> a) {
        int max = 0;
        for(int s = 0; s < a.size(); s++) {
            if (max < a.get(s)) {
                max = a.get(s);
            }

        }
        return max;
    }
    public static int minB(List<Integer> b) {
        int min = 100;
        for(int s = 0; s < b.size(); s++) {
            if (min > b.get(s)) {
                min = b.get(s);
            }

        }
        return min;
    }

    public static void main(String ar[]) {
        System.out.println(getTotalX(List.of(2), List.of(20,30,12)));
    }

}
