public class HackerRankTimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String checkPmOrAm = s.substring((s.length() -2), s.length());
        Integer hours = Integer.parseInt(s.substring(0, 2));


//        if (checkPmOrAm.equals("PM") && hours == 12) {
//            return s.substring(0, (s.length()-2));
//        } else
        if (checkPmOrAm.equals("PM") && hours < 12) {
            int hours24 = hours + 12;
            String newTime = hours24 + s.substring(2, s.length());
            return newTime.substring(0,(newTime.length()-2));
        } else if(checkPmOrAm.equals("AM") && hours == 12){
            String newTime = "00" + s.substring(2, s.length());
            return newTime.substring(0,(newTime.length()-2));
        } else {
            return  s.substring(0, (s.length()-2));
        }

    }
    public static void main(String ar[]) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
