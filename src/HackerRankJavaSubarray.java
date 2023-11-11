import java.util.Arrays;

public class HackerRankJavaSubarray {


    public static void main(String ar[]) {

        int s[] = new int[]{1 ,-2, 4, -5, 1};
        int count = 0;

        for(int i=0; i < s.length; i++) {
            int sum = 0;

            for(int j =i ; j < s.length; j++){
                sum += s[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        count = (int) Arrays.stream(s)
                .flatMap(i -> Arrays.stream(Arrays.copyOfRange(s, i, s.length)))
                .reduce(0, (sum, num) -> {
                    int newSum = sum + num;
                    return newSum < 0 ? sum + 1 : sum;
                });

        System.out.println(count);
    }
}
