import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankIpAddressSolution {


    public static void main(String ar[]) {
        String regEx = "(\b\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        while (a > 0) {
            String c = scanner.nextLine();
            String pattr = regEx+"."+regEx+"."+regEx+"."+regEx;
            Pattern p = Pattern.compile(pattr);

            Matcher ma = p.matcher(c);
            if (ma.find()) {
                System.out.println(ma.group());
                if(c.equals(ma.group())) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }else {
                System.out.println("false");
            }

            a--;
        }
    }
}
