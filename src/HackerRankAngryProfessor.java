import java.util.List;

public class HackerRankAngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        long filterCount = a.stream().filter(s-> s <= 0).count();
        if (filterCount >= Long.valueOf(k)) {
            return "YES";
        }

       return "NO";
    }

    public static void main(String ar[]) {
        System.out.println(angryProfessor(2, List.of(0, -1, 2, 1)));
    }
}
