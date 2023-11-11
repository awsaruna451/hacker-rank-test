import java.util.ArrayList;
import java.util.List;

public class HackerRankArraysLeftRotation {

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
        List<Integer> rotateValue = new ArrayList<>();
        int i = 0;
        while(i < d) {
            rotateValue.add(a.get(i));
            i++;
        }

        List<Integer> rightValue = new ArrayList<>();
        int j = d;
        while(j < a.size()) {
            rightValue.add(a.get(j));
            j++;
        }

        rightValue.addAll(rotateValue);

        return rightValue;

    }

    public static void main(String[] args) {
        System.out.println(rotLeft(List.of(1 ,2 ,3 ,4, 5), 4));
    }

}
