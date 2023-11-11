import java.util.Arrays;

public class HackerRankJavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        java.util.List<String> x = a.chars().mapToObj(s -> String.valueOf((char) s).toLowerCase()).sorted().collect(java.util.stream.Collectors.toList());
        java.util.List<String> y = b.chars().mapToObj(s -> String.valueOf((char) s).toLowerCase()).sorted().collect(java.util.stream.Collectors.toList());


        if (x.equals(y)) {
            return true;
        }
        return false;
    }

    public static boolean isAnagram2(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }



    public static void main(String ar[]) {
        boolean ret = isAnagram("anagram", "margana");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
