import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HackerRankModifiedKaprekarNumbers {

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        StringBuilder cupNum = new StringBuilder();

        for(int a= p ; a <= q ; a++) {
            long y = (long) a * a;
            String values = String.valueOf(y);
             int sum = 0;
            if (values.length() >= 2) {
                 sum = Integer.parseInt(values.substring(0, values.length() / 2)) + Integer.parseInt(values.substring(values.length() / 2, values.length()));
            } else {
                sum = Integer.parseInt(values);
            }
            if (sum == a) {
                cupNum.append(a);
                cupNum.append(" ");
                continue;
            }
        }
        if (cupNum != null && cupNum.length() != 0) {
            System.out.println(cupNum);
        } else {
            System.out.println("INVALID RANGE");
        }

    }



    public static void main(String ar[]) {
      kaprekarNumbers(400, 700);
       // System.out.println(circularArrayRotation(List.of(1,2,3), 2,List.of(0,1,2)));
    }
}
