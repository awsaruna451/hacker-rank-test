public class HackerRankStrangeCounter {

    public static long strangeCounter(long t) {
        // Write your code here

        int n = 3;

        while (t > n) {
            t -=n;
            n *= 2;
        }



        return n -t +1;
    }

    public static void main(String[] args) {

        System.out.println(strangeCounter(4));
        //
        //System.out.println(abbreviation("wZPRSZwGIMUAKONSVAUBUgSVPBWRSTJZECxMTQXXA","ZPRSZGIMUAKONSVAUBUSVPBWRSTJZECMTQXXA"));
    }

}
