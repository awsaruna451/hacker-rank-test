import java.util.*;

public class HackerRankMonthPreparationKitWeek2Q2 {


    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n - 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid+1 ;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        findZigZagSequence(new int[]{1, 2 ,3 ,4 ,5, 6 ,7},7);
     //   System.out.println(twoArrays(5, List.of(1, 2 ,2 ,1), List.of(3, 3, 3, 4)));
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

       // System.out.println(flippingBits(1));
       // System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
       //System.out.println(findZigZagSequence(9,List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));

    }
}

