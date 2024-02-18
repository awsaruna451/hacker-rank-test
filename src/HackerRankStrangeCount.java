public class HackerRankStrangeCount {
    public static long strangeCounter(long t) {

        int n = 3;
        while (t >= ((n-2) + n))   {

            n = n * 2;


        }

        int actualVal = n -2;
        if (t > actualVal)  {

            long dis = t-actualVal;
            return  n - dis;


        }

        return n;


    }

    public static void main(String[] args) {

        System.out.println(strangeCounter(4));
       // System.out.println(abbreviation("wZPRSZwGIMUAKONSVAUBUgSVPBWRSTJZECxMTQXXA","ZPRSZGIMUAKONSVAUBUSVPBWRSTJZECMTQXXA"));
    }

}
