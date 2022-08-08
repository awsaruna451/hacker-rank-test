import java.util.List;

public class HackerRankBillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int annaeatCost = 0;
        int totalCost = 0;
        for (int i =0; i < bill.size(); i++) {

            if (i != k ) {
                annaeatCost += bill.get(i);
            }


        }
        int annacost = annaeatCost/2;
        int refund = b - annacost;

        if ( refund == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(refund);
        }


    }
    public static void main(String ar[]) {
       bonAppetit(List.of(3, 10, 2, 9), 1, 12);
    }
}
