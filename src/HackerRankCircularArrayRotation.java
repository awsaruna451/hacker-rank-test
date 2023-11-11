import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankCircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here

        int arraySize = a.size();
        if (k> arraySize) {
            k = k%arraySize;
        }

        List<Integer> rotationArray = new ArrayList<>();
        for(int x = arraySize-k; x < arraySize; x++) {
            rotationArray.add(a.get(x));
        }

        for(int p =0; p< arraySize-k; p++) {
            rotationArray.add(a.get(p));
        }

        List<Integer> values = queries.stream().map(q -> {
            return rotationArray.get(q);
        }).collect(Collectors.toList());

        return values;
    }

    public static List<Integer> circularArrayRotationJava8(List<Integer> a, int k, List<Integer> queries) {
        int arraySize = a.size();
        if (k> arraySize) {
            k = k%arraySize;
        }
        List<Integer> rotationArray = new ArrayList<>(arraySize);
        rotationArray.addAll(a.subList(arraySize - k, arraySize));
        rotationArray.addAll(a.subList(0, arraySize - k));

        return queries.stream()
                .map(rotationArray::get)
                .collect(Collectors.toList());
    }


    public static void main(String ar[]) {

        System.out.println(circularArrayRotation(List.of(1,2,3), 2,List.of(0,1,2)));
    }
}
