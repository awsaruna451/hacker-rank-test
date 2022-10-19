import java.util.*;
import java.util.stream.Collectors;

public class HackerRankSequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List<Integer> permutation = new ArrayList<>();
        Map<Integer, Integer> a = p.stream().collect(Collectors.toMap(Integer::intValue, i -> (p.indexOf(i) +1)));
        for(Map.Entry<Integer, Integer> s: a.entrySet()) {
            permutation.add(a.get(s.getValue()));
        }

    return permutation;
    }
    public static void main(String ar[]) {
        System.out.println(permutationEquation(List.of(4, 3, 5, 1, 2)));
    }
}
