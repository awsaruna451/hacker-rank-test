import java.util.Arrays;

public class HackerRankMonthPreparationKitWeek2Q3 {


    public static int pageCount(int n, int p) {
        // Write your code here
        int pageCount = 0, numberOfTurn = 0, numberOfTurnFromLast=0;
        int leftRight = p/2;
        int rightToLeft = n/2 -p/2;

        if (leftRight > rightToLeft) {
            leftRight = rightToLeft;
        }

        return leftRight;

    }




    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
      //  findZigZagSequence(new int[]{1, 2 ,3 ,4 ,5, 6 ,7},7);
     //   System.out.println(twoArrays(5, List.of(1, 2 ,2 ,1), List.of(3, 3, 3, 4)));
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));
       // System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
       //System.out.println(findZigZagSequence(9,List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));

    }
}

