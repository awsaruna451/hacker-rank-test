import java.util.ArrayList;
import java.util.List;

public class HackerRankGradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrade = new ArrayList<>();

        for (int a=0; a< grades.size();a++) {

            for (int p = 5; p<=100; p =p +5) {

                if (grades.get(a) <= p) {

                    if (p < 40) {
                        roundedGrade.add(grades.get(a));
                        break;
                    } else {

                        if ((p - grades.get(a)) < 3) {
                            roundedGrade.add(p);
                            break;

                        } else {
                            roundedGrade.add(grades.get(a));
                            break;
                        }
                    }

                }

            }

        }
     return roundedGrade;
    }

    public static void main(String ar[]) {
        System.out.println(gradingStudents(List.of(73,
                67,
                38,
                33)));
    }
}
