/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRankFormingAMagicSquare {

    public static int formingMagicSquare(List<List<Integer>> s) {
        // Write your code here
        int chCount =0;
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < s.size(); i++) {
            List<Integer> value = s.get(i);
            for (int j = 0; j < value.size(); j++) {
                if(i==1 && j==1 && value.get(j) !=5) {
                    chCount = Math.abs(value.get(j)-5);
                    value.remove(j);
                    value.add(j, 5);
                }

            }
            list1.add(value);
        }

        for(int p = 0; p < list1.size(); p++) {

            List<Integer> val = list1.g
        }



        return chCount;


    }


}


//    public static int formingMagicSquare(List<List<Integer>> s) {
//        // Write your code here
//        Map<Integer, Integer> replaceVal = new HashMap<>();
//        int outPut = 0;
//        for (int a =0; a < s.size(); a++) {
//
//
//
//        }
//        int outPut = 0;
//       for(Map.Entry<Integer,Integer> entry : replaceVal.entrySet()) {
//           outPut += Math.abs(entry.getKey() - entry.getValue());
//       }
//        return outPut;
//    }
//
//    public static int sumRow(List<Integer> val) {
//        int sum = 0;
//        for (int b =0; b < val.size(); b++) {
//
//           sum += val.get(b);
//        }
//
//        return sum;
//    }
//
//    public static void main(String ar[]) {
//        System.out.println(formingMagicSquare(List.of(List.of(5, 3, 4), List.of(1, 5, 8) , List.of(6, 4, 2) )));
//    }

}
*/
