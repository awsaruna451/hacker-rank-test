import java.util.ArrayList;
import java.util.List;

public class LeetCodeChalkboard {

    public static boolean divisorGame(int n) {

        int x = 1;
        int ballCount = 0;
        while (x < n ) {
                ballCount++;

            x++;

        }

        if (ballCount%2 == 0) {
            return false;
        }

     return true;
    }

    public static void main(String[] args) {

        System.out.println(divisorGame(2));
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
