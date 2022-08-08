public class HackerRankCountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int seaLevel = 0;
        int vallyLevel = 0;
        for(int p = 0 ; p < steps; p++) {

            if ("U".equals(path.substring(p, p+1))) {
                seaLevel++;
                if (seaLevel == 0) {
                    vallyLevel++;
                }
            } else {
                seaLevel--;
            }

        }
     return vallyLevel;
    }
    public static void main(String ar[]) {
        System.out.println(countingValleys(8,"UDDDUDUU"));
    }
}
