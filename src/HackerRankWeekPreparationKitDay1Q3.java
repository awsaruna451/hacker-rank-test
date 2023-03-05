import java.util.List;

public class HackerRankWeekPreparationKitDay1Q3 {

    public static String timeConversion(String s) {
        // Write your code here
        String format = s.substring(s.length()-2, s.length());
        String timeVal = s.substring(0, s.length()-2);
        String time_24="00:00:00";
        String [] times = timeVal.split(":");
        if (format.equals("AM")) {
            if(times[0].equals("12")) {
                time_24 = "00:" +times[1] +":" +times[2];

            } else {
                time_24 = times[0]+":" +times[1] +":" +times[2];
            }
        } else {
            if(!times[0].equals("12")) {
                time_24 = (Integer.parseInt(times[0]) +12 ) + ":"  +times[1] +":" +times[2];
            } else {
                time_24 = times[0]+":" +times[1] +":" +times[2];
            }
        }

        return time_24;

    }

    public static void main(String[] args) {
       // check("I love Love to To tO code");
       // plusMinus(List.of(1,1,0,-1,-1));

        System.out.println(timeConversion("04:59:59AM"));

    }
}

