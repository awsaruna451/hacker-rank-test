public class HackerRankNumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        if (v2 > v1 && x2 > x1) {
            return "NO";
        }

        else {
            int xdiff = x1 - x2;
            int vdiff = v2 - v1;

            if ((xdiff < 0 && vdiff < 0) || (xdiff > 0 && vdiff > 0)) {
                int mod = xdiff % vdiff;
                int mod2 = vdiff % xdiff;
                if (mod == 0 || mod2 == 0) {
                    return "YES";
                }
            }
            boolean isEqual = false;
            while (x1 <= 10000) {
                x1+=v1;
                x2+=v2;
                if (x1==x2) {
                    isEqual = true;
                    break;
                }
            }
            if (isEqual) {
                return "YES";
            } else {
                return "NO";
            }
        }

    }
    public static void main(String ar[]) {
        System.out.println(kangaroo(4523,8092 ,9419,8076));
    }
}
