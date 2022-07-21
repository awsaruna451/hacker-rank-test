public class HackerRankSherlockAndSquares {

    public static int squares(int a, int b) {
        // Write your code here
        int x = (int)Math.ceil(Math.sqrt(a));
        int y = (int)Math.floor(Math.sqrt(b));
        int square_count = y - x + 1;

        return square_count;
    }

    public static void main(String ar[]) {
        System.out.println(squares(24, 49));
    }
}
