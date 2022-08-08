public class HackerRankDayOfTheProgrammer {

    public static String dayOfProgrammer(int year) {
        // Write your code here
        int m = 1;
        int days = 0;
        String month = "";

         while (m <= 12) {
             days += daysOfMonth(m, year);
             if (days >= 256) {
                 days = days - daysOfMonth(m , year);
                 break;
             }

             m++;
         }
         month = String.valueOf(m);
         if (month.length() < 2) {
             month = "0"+month;
         }

       return (256-days)+"."+month+"."+year;


    }

    public static int daysOfMonth(int m, int y){

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if ( m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;

        } else {
            if (y <= 1917) {
                if (y % 4 == 0) {

                    return 29;

                } else {
                    return 28;
                }
            } else if (y >= 1919) {
                if ((y % 400 == 0) || (y % 4 == 0 && y %100 !=0)) {

                    return 29;

                } else {
                    return 28;
                }
            } else {
                return 15;
            }
        }

    }

    public static void main(String ar[]) {
        System.out.println(dayOfProgrammer(1918));
    }
}
