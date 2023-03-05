
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankValidUsernameRegularExpression {

    public static void check(String input){

        String pattern = "(\\b\\w+\\b)(\\s*\\1\\b)+";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);



            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(), m.group(1));
                findMatch = false;
            }
            System.out.println(input);


    }
/*    public static void check(String input){

        //String pattern = "([\\w]{1}([\\w_])+){7,29}";
        String pattern = "[a-z][a-zA-Z0-9_]{7,29}";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);


            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                System.out.println(m.group());
                findMatch = false;
            }
            System.out.println(input);

    }*/

    public static void main(String[] args) {
       // check("_Julia007");
        check("I love Love to To tO code");

    }
}

