import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HackerRankAbsolutePermutation {

    public static List<Integer> absolutePermutation1(int n, int k) {
        Set<Integer> valPop = new HashSet<>();

        List<Integer> permu1 = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());

        List<Integer> permu2 = IntStream.rangeClosed(1, n)
                .map(i -> (i > k) ? valPop.contains(i + k) ? i - k : i + k : i + k)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> permu3 = new ArrayList<>(permu2);
        Collections.sort(permu3);

        Set<List<Integer>> val = new HashSet<>(List.of(permu1, permu3));

        if (val.size() > 1) {
            return List.of(-1);
        } else {
            return IntStream.rangeClosed(1, n).mapToObj(i -> permu2.get(n - i)).collect(Collectors.toList());
        }
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        // Write your code here

        Set<Integer> valPop = new HashSet<>();

        List<Integer> permu1= new ArrayList<>();
        List<Integer> permu2= new ArrayList<>();
        List<Integer> permu3= new ArrayList<>();
        Set<List<Integer>> val = new HashSet<>();

        for(int i = n; i >=1; i--) {
            permu1.add(i);
            if (i > k) {
                int j = 0;
                if ((i+k) <= n) {
                     j = valPop.contains((i +k)) ? (i-k): (i+k);
                } else {
                     j = i-k;
                }


                permu2.add(j);
                valPop.add(j);
            } else {
                permu2.add(i+k);
                valPop.add(i+k);
            }


        }

        permu3.addAll(permu2);
        Collections.sort(permu1);
        Collections.sort(permu3);
        val.add(permu1);
        val.add(permu3);

        if (val.size() > 1) {
           return List.of(-1);

        } else {
             List<Integer> ev = new ArrayList<>();
            for(int z =permu2.size()-1; z >=0; z-- ) {
                ev.add(permu2.get(z));
            }

            return ev;
        }




    }


    public static void main(String[] args) {
       System.out.println(absolutePermutation(4, 2));
    //   System.out.println(absolutePermutation(10, 1));
    }

}
