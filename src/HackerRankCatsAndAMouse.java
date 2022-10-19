public class HackerRankCatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {

        if (z > x && z > y) {
            if ((z -y) < (z-x)) {
                return "Cat B";
            } else if((z -y) == (z-x) ) {
                return "Mouse C";
            } else {
                return "Cat A";
            }
        } else if( z == x && (z > y || z < y)) {
            return "Cat A";
        } else if((z > x || x > z) && y == z) {
            return "Cat B";
        } else {
            if (Math.abs(z -x) < Math.abs(z -y)) {
                return "Cat A";
            } else if(Math.abs(z -x) > Math.abs(z -y)) {
                return "Cat B";
            } else {
                return "Mouse C";
            }
        }


    }

    public static void main(String ar[]) {
        System.out.println(catAndMouse(1, 3, 2));
    }
}
