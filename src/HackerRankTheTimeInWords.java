import java.util.ArrayList;
import java.util.List;

public class HackerRankTheTimeInWords {
    public static String timeInWords(int h, int m) {
        // Write your code here
        String[] single_digits = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine"
        };


        String[] two_digits = new String[] {
                "ten",      "eleven",  "twelve",
                "thirteen",  "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        String[] tens_multiple = new String[] {
                "","","twenty",  "thirty", "forty",
                "fifty"
        };

       StringBuilder builder = new StringBuilder();
       String hours = "";
      if (h < 10 ) {
           hours = single_digits[h];
       } else{
          String x = String.valueOf(h).substring(1, 2);
          hours = two_digits[Integer.parseInt(x)];
       }

      String minutesStr = String.valueOf(m);
        String mFirst = "0";
        String secondPart = "";
      if (minutesStr.length() > 1) {
          mFirst = String.valueOf(m).substring(0, 1);
          secondPart = String.valueOf(m).substring(1, 2);


      }

      if(m == 0) {
          builder.append(hours).append(" ");
          builder.append("o' clock");
      } else if (m < 30) {
          if ( m == 15) {
              builder.append("quarter past").append(" ").append(hours);
          }else if(m < 10) {
              if ( m == 1) {
                  builder.append(single_digits[m])
                          .append(" minute past").append(" ").append(hours);
              } else {
                  builder.append(single_digits[m])
                          .append(" minutes past").append(" ").append(hours);
              }
          }

              else {

              if (Integer.parseInt(mFirst) > 1) {
                  builder.append(tens_multiple[Integer.parseInt(mFirst)]).append(" ");
                  if (Integer.parseInt(secondPart) !=0) {
                      builder.append(single_digits[Integer.parseInt(secondPart)])
                              .append(" minutes past").append(" ").append(hours);
                  } else {
                      builder.append("minutes past").append(" ").append(hours);
                  }

              } else {



                      builder.append(two_digits[Integer.parseInt(secondPart)])
                              .append(" minutes past").append(" ").append(hours);

              }

          }

      } else if ( m == 30) {
           builder.append("half past").append(" ").append(hours);
      } else {
          if (h < 10 ) {
              hours = single_digits[h+1];
          } else{
              String x = String.valueOf(h).substring(1, 2);
              if (h < 12) {
                  hours = two_digits[Integer.parseInt(x)+1];
              } else {
                  hours = single_digits[1];
              }

          }
          if ( m == 45) {
              builder.append("quarter to").append(" ").append(hours);
          } else {
            minutesStr = String.valueOf(60-m);
              if (minutesStr.length() > 1) {
                  mFirst = String.valueOf(60-m).substring(0, 1);
                  secondPart = String.valueOf(60-m).substring(1, 2);

                  if (Integer.parseInt(mFirst) > 1) {
                      builder.append(tens_multiple[Integer.parseInt(mFirst)]).append(" ");
                      if (Integer.parseInt(secondPart) !=0) {
                          builder.append(single_digits[Integer.parseInt(secondPart)])
                                  .append(" minutes to").append(" ").append(hours);
                      } else {
                          builder.append("minutes to").append(" ").append(hours);
                      }
                  } else {



                      builder.append(two_digits[Integer.parseInt(secondPart)])
                              .append(" minutes to").append(" ").append(hours);

                  }
              } else {
                  builder.append(single_digits[60-m])
                          .append(" minutes to").append(" ").append(hours);
              }


          }

      }



     return builder.toString();

    }

    public static void main(String ar[]) {

      System.out.println(timeInWords(1,1));
    }
}
