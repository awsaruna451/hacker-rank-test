import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankStringAndOccurrences {


    public static void main(String ar[]) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        while (a > 0) {

            String x = scanner.nextLine();
            Pattern pattern = Pattern.compile("([a-zA-Z]{1})");
            Matcher matcher = pattern.matcher(x);
            int count = 0,from=0;
            Map<String, Integer> map = new HashMap<>();
            while (matcher.find()) {
               String s = matcher.group();
               System.out.print(s.length());


            }
            System.out.println("");

            a--;
        }

    /*    while (a > 0) {
            String p = scanner.nextLine();
            String regex = "\\?<://w{2}?(2|w).[a-z0-9].com";
            Pattern sc = Pattern.compile(regex);
            Matcher m = sc.matcher(p);
            if (m.find()) {
                System.out.println(m.group());

            }


            a--;

        }*/
    }
}
