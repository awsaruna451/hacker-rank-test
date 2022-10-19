public class HackerRankViralAdvertising {

    public static int viralAdvertising(int n) {
        // Write your code here
       int men = 5;
       int totalLike = 0;
        while(n-- > 0) {

            int receipnt = men/2 ;
            totalLike += receipnt;
            men = receipnt * 3;
        }
      return totalLike;
    }

    public static void main(String ar[]) {
        System.out.println(viralAdvertising(3));
    }

}
