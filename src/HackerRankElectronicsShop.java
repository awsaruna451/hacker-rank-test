public class HackerRankElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int maxPrice = -1;
        for (int k = 0; k < keyboards.length;k ++) {
            if (keyboards[k] >= b) {
                continue;
            }

            for (int p = 0; p < drives.length; p++) {
                if ( (drives[p] + keyboards[k]) <= b) {
                    if (maxPrice < (drives[p] + keyboards[k])) {
                        maxPrice = (drives[p] + keyboards[k]);
                    }
                }
            }

        }

     return  maxPrice;
    }

    public static void main(String ar[]) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8},10));
    }
}
