import java.util.ArrayList;
import java.util.List;

public class LeetCodePascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> mainArray = new ArrayList<>();

        for (int j=1; j<= numRows; j++) {
            List<Integer> subArray = new ArrayList<>();
            for (int a = 1; a <= j; a++) {
                if (a == 1 || a == j) {
                    subArray.add(1);
                } else {
                    List<Integer> val = mainArray.get(mainArray.size() -1);
                    subArray.add(val.get(a-1) + val.get(a-2));
                }
            }
            mainArray.add(subArray);


        }
       return mainArray;
    }



    public static void main(String[] args) {
        int[] x = new int[]{7,1,5,3,6,4};
        List<List<Integer>> p = generate(4);

       System.out.println(p);
        //System.out.println(y[0] +":::::" + y[1]);*/
    }
}
