public class HackerRankTaumAndBday {


    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long costBgift = 0;
        long constWgift = 0;

        if (bc > (wc + z) ) {
            costBgift = (long) b * (wc +  z);
        } else {
            costBgift = (long) b * bc;
        }

        if (wc > (bc + z)) {
            constWgift = (long) w * (bc + z);
        } else {
            constWgift = (long) w * wc;
        }

        return  (long) (constWgift + costBgift);



    }


    public static void main(String[] args) {
        System.out.println(taumBday(27984,1402,619246,615589,247954));
    }

}
