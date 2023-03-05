import java.text.DecimalFormat;
import java.util.List;

public class HackerRankWeekPreparationKitDay1Q1 {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positiveCount = 0, negativeCount = 0, equalCount = 0;
        int len = arr.size();

        for (int i =0; i < arr.size(); i++) {
             if (arr.get(i) > 0) {
                 positiveCount++;
             } else if( arr.get(i) == 0) {
                 equalCount++;
             } else {
                 negativeCount++;
             }
        }

        double val = ((double)positiveCount)/len;
        double val2= ((double)negativeCount)/len;
        double val3= ((double)equalCount)/len;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(val));
        System.out.println(df.format(val2));
        System.out.println(df.format(val3));

    }
    public static void main(String[] args) {
       // check("I love Love to To tO code");
        plusMinus(List.of(1,1,0,-1,-1));

    }
}

