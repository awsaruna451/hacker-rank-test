import java.util.List;

public class HackerRankLoveLetterMystery {

    public static int theLoveLetterMystery(String s) {
        // Write your code here
        int count = 0;
        List<String> wor = List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        int n = s.length();
        int len = n/2;
        for (int i=0; i < len ; i++) {
            String first = String.valueOf(s.charAt(i));
            String last = String.valueOf(s.charAt(n-1-i));
            if(!first.equals(last)) {
                int indexOfFirst = wor.indexOf(first);
                int indexOfLast = wor.indexOf(last);

                count += Math.abs(indexOfLast-indexOfFirst);

            }
        }

        


       return count;
    }

   /* public static boolean isPalindromes(String s) {

    }*/

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abc"));
    }

}
