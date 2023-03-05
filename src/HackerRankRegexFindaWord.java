import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankRegexFindaWord {


    public static void main(String ar[]) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        while (a > 0) {
            String p = scanner.nextLine();
            String regex = "^foo[a-zA-Z_]";
            Pattern sc = Pattern.compile(regex);
            Matcher m = sc.matcher(p);
            if (m.find()) {
                System.out.println(m.group());
            }


            a--;

        }
    }
}
