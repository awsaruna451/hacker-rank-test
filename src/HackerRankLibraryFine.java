import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankLibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int yearCharge = 10000;
        int monthCharge = 500;
        int dayCharge = 15;

        int charge = 0;

        if (y2 < y1) {
            charge = yearCharge * (y1-y2);
        } else if (y2== y1) {
            if (m2 <= m1) {


                if (m2==m1) {
                    if (d2 < d1) {
                        charge = dayCharge * (d1-d2);
                    }
                } else {
                    charge = monthCharge * (m1-m2);
                }

            }

        }
     return charge;
    }

    public static void main(String[] args) {

        System.out.println(libraryFine(9,6,2015, 6, 6, 2015 ));
    }

}
