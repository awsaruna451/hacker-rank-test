import java.util.*;
import java.util.stream.Collectors;

public class HackerRankBiggerIsGreater1 {
    public static String biggerIsGreater(String w) {
        // Write your code here

        boolean isBigger = false;
        List<Character> characters = new ArrayList<>();
        List<Character> characters1 = new ArrayList<>();

        StringBuilder biggerString = new StringBuilder();

        for(int y=0; y < w.length(); y++) {
            System.out.println("ch::"+w.charAt(y));
            characters.add(w.charAt(y));
        }


        for(int x= w.length()-1; x >= 1 ; x--) {
            if(w.charAt(x) > w.charAt(x-1) ) {
              isBigger =true;
              characters1 = makeCharacters(w.substring(x-1, w.length()), (x-1) == 0 ? true:false, characters, (x-1), w.charAt(x-1));




                break;
            }
        }

        if (!isBigger) {
            return "no answer";
        } else {
            characters1.forEach(x -> biggerString.append(x));
            return biggerString.toString();
        }


    }

    public static List<Character> makeCharacters(String shiftValue, boolean valu, List<Character> val, int start, Character ch) {

       char [] charArray = shiftValue.toCharArray();
        List<Character> sortedCharList =  new ArrayList<>();


        if (valu) {
            Collections.sort(val);
            int index = val.indexOf(ch);
            sortedCharList.add(val.get(index+1));
            val.remove(index+1);
            sortedCharList.addAll(val);

        } else {
           List<Character> listV= shiftValue.chars().mapToObj(c -> (char) c)
                    .sorted((c1,c2) -> Character.compare(c2,c1))  // Use reverse order here
                    .collect(Collectors.toList());

             int index = listV.indexOf(ch);

            sortedCharList = val.stream().limit(start).collect(Collectors.toList());
            sortedCharList.add(listV.get(index-1));
            listV.remove(index-1);
            Collections.sort(listV);
            sortedCharList.addAll(listV);
        }
        //Arrays.stream(shiftValue.toCharArray()).boxed().sorted((c1,c2) ->Character.compare(c2,c1)).collect(Collectors.toList())

         return sortedCharList;
    }

    public static void main(String ar[]) {
    //    System.out.println(biggerIsGreater("dkhc"));
        System.out.println(biggerIsGreater("abdc"));
     //   System.out.println(biggerIsGreater("dhck"));
    }
}
