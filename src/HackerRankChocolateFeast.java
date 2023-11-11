import java.util.HashMap;
import java.util.Map;

public class HackerRankChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        // Write your code here
        int numChock = n/c;

        int eatingChock = numChock;
       if(m == numChock) {
            eatingChock ++;
        } else if(m < numChock) {
           int reminder = 0;
          while(m <= numChock) {
              reminder = (numChock) % m;
              numChock = (numChock-reminder)/m;
              eatingChock += numChock;
              numChock += reminder;
          }

       }
      return eatingChock;
    }


    public static void main(String ar[]) {
       System.out.println(chocolateFeast(10, 2,5));
    }
}
