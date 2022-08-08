public class HackerRankDrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        if (p == 1) {
            return 0;
        }
        int pageFromStartCount = 0;
        for (int k = 2; k < n;) {
            pageFromStartCount++;
            if (k == p || k+1 == p) {
                break;
            }
            k +=2;

        }
        int pageFromLast = 0;
        int maxPage = n - 1;
        if (maxPage % 2 != 0) {
            if (n == p) {
                return 0;
            } else {
                for(int k = (n -1); k > 1;) {
                    pageFromLast++;
                    if ( k ==p || (k-1) == p) {
                        break;
                    }
                    k -=2;
                }

            }

        } else {
            for(int k = n; k > 1;) {

                if ( k ==p || (k-1) == p) {
                    break;
                }
                pageFromLast++;
                k -=2;
            }
        }


      if (pageFromStartCount < pageFromLast) {
          return pageFromStartCount;
      } else {
          return pageFromLast;
      }

    }

    public static void main(String ar[]) {
        System.out.println(pageCount(5,4));
    }
}
