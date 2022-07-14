import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HackerRankBinaryNumbers {

    public static int binaryNumber(int n) {



        int previous = -1;
        int max = 0;
        int maxValue = 0;
        while (n > 0) {
            int reminder = n %2;

            if (previous != 0) {
                if (reminder == 1) {
                    maxValue = maxValue + 1;
                } else {
                    maxValue = 0;
                }


            } else {
                maxValue = 0;
            }
            if (maxValue > max) {
                max = maxValue;
            }


            n = n/2;

        }


        return max;
    }

    public static void main(String ar[]) {
        System.out.println(binaryNumber(13));
    }
}
