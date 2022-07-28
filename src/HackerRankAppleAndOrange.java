import java.util.List;

public class HackerRankAppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

       System.out.println(fruitHomeInclusiveCount(apples, s, t, a));
       System.out.println(fruitHomeInclusiveCount(oranges, s, t, b));



    }

    public static int fruitHomeInclusiveCount(List<Integer> fruit, int value1, int value2, int value) {
        int appleCount = 0;
        for (int x=0; x< fruit.size(); x++) {

            int ap = value + fruit.get(x);
            if ( ap >= value1 && ap <= value2) {
                appleCount++;
            }
        }
        return appleCount;
    }

    public static void main(String ar[]) {
        countApplesAndOranges(7, 10, 4, 12, List.of(2,3,-4), List.of(3, -2, -4));
    }

}
