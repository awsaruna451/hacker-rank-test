import java.text.DecimalFormat;
import java.util.List;
import java.util.regex.Matcher;

public class HackerRankWeekPreparationKitDay2Q2 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diagonal1 = 0, diagonal2 =0;
        for(int i=0; i < arr.size(); i++) {

            List <Integer> arr2 = arr.get(i);
            for (int j = 0; j < arr2.size(); j++) {
                if (i == j) {
                    diagonal1 += arr2.get(j);
                }

                if (Math.abs(i-j) == (arr.size()-1) || (i+j == (arr.size()-1))) {
                    diagonal2 += arr2.get(j);
                }
            }

        }

        return Math.abs(diagonal1-diagonal2);

    }
    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // diagonalDifference(List.of(1,1,0,-1,-1));

    }
}

