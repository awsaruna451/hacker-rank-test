import java.util.List;

public class HackerRankBeautifulTriplets {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here

        int countval = 0;

        for(int i=0; i < arr.size(); i++) {

            int val= arr.get(i);
            int count = 1;

            for(int j = i+1; j < arr.size(); j++) {

                if ( (val + d) == arr.get(j)) {
                    val += d;
                    count++;
                }
                if (count ==3) {
                    break;
                }


            }

            if (count == 3) {
                countval ++;
            }


        }

        return countval;

    }




    public static void main(String[] args) {

      System.out.println(beautifulTriplets(3, List.of(1, 2, 4, 5, 7, 8, 10)));
    }

}
