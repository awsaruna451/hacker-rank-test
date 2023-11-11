import java.util.ArrayList;
import java.util.List;

public class HackerRankCountingValley {
    public static int countingValleys(int steps, String path) {
        int count = 0;
        // Write your code here

        int seaLevel = 0;
        boolean startLevel = true;

        for(int i=0; i < steps; i++){
            String v = String.valueOf(path.charAt(i));

            if("U".equals(v)) {
                seaLevel++;
            } else {
                seaLevel--;
            }


            if (seaLevel == -1 && startLevel) {
                count++;
            }

            if(seaLevel == 0) {
                startLevel = true;
            } else {
                startLevel = false;
            }




        }

        return count;

    }

    public static void main(String ar[]) {

      System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
