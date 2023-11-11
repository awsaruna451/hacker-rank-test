import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerRankLisasWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here

        int pageCount = 0;
        int specialCount = 0;

        for(int i=1; i <= arr.size(); i++) {

            int val = arr.get(i-1);
            if (val < k) {
                pageCount++;
                if (pageCount <= val) {
                    specialCount++;
                }

            } else {
                int v = val%k;
                int p = val/k;
                int totPageCount= p + (v > 0 ? 1 : 0);
                int total = p * k + v;
                int c = 1;
                while (c <= totPageCount) {
                    pageCount++;
                    int start = (c-1) * k;
                    int end = c *k;
                    if (end > total ) {
                        end = total;
                    }
                    for (int y = start+1; y <=end; y++) {
                        if (pageCount == y) {
                            specialCount++;
                        }
                    }
                    c++;
                }


            }

        }


     return specialCount;
    }

    public static void main(String[] args) {

    // System.out.println(workbook(10,5, List.of(3, 8 ,15,11, 14, 1 ,9 ,2 ,24 ,31)));
     System.out.println(workbook(25,10, List.of(1 ,29 ,94 ,15 ,87 ,100, 20 ,55 ,100 ,45 ,82 ,80 ,100 ,100 ,3 ,53 ,100, 2, 100 ,100 ,100 ,100, 100 ,100, 1)));
    }

}
