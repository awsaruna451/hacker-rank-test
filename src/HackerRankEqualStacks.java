import java.util.List;

public class HackerRankEqualStacks {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int h1size = h1.size();
        int h2size = h2.size();
        int h3size = h3.size();
        boolean h2isSmall = false;
        boolean h1isSmall = false;
        boolean h3isSmall = false;
        if (h1size < h2size) {
            h1isSmall = true;
        } else {
            h2isSmall = true;
        }

        if (h2isSmall) {
            if (h3size > h2size) {
                h2isSmall = true;
            } else {
                h2isSmall = false;
                h3isSmall = true;
            }
        }

        if (h1isSmall) {
            if (h3size > h1size) {
                h1isSmall = true;
            } else {
                h1isSmall = false;
                h3isSmall = true;
            }
        }

        if(h1isSmall) {
            System.out.println("h1 is smaller::" + h1isSmall);
        } else if(h2isSmall) {
            System.out.println("h2 is smaller::" + h2isSmall);
        } else {
            System.out.println("h3 is smaller::" + h3isSmall);

            for (int a=0; a < h3.size(); a++) {

            }

        }



      return 0;

    }

    public static void main(String[] args) {
        System.out.println(equalStacks(List.of(1,2,1,1), List.of(1,1,2), List.of(1,1)));
    }

}
