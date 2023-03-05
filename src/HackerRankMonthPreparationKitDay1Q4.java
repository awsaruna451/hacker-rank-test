import java.util.*;

public class HackerRankMonthPreparationKitDay1Q4 {

    public static long flippingBits(long n) {
        // Write your code here
        long number = ~n;
        long unsignedNumber = number & 0xffffffffL;
        return unsignedNumber;
    }

    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

        System.out.println(flippingBits(1));

    }
}

