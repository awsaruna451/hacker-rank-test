import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankCavityMap {


    public static List<String> cavityMap(List<String> grid) {
        // Write your code here

        List<String> val = new ArrayList<>();

        if (grid.size() == 2) {
            val.add(grid.get(1));
            return val;
        }
        val.add(grid.get(0));

       for(int j=1;j < grid.size()-1; j++) {
           char[] y = grid.get(j).toCharArray();
           char[] x = y.clone();

               for (int i = 1; i < y.length-1; i++) {
                   int e = Integer.parseInt(String.valueOf(y[i]));

                   if (e > Integer.parseInt(String.valueOf(grid.get(j-1).charAt(i))) && e > Integer.parseInt(String.valueOf(grid.get(j+1).charAt(i)))
                   && e > Integer.parseInt(String.valueOf(y[i-1])) && e > Integer.parseInt(String.valueOf(y[i+1]))
                   ) {
                       x[i] = 'X';
                   }

               }
           val.add(String.valueOf(x));


       }
       val.add(grid.get(grid.size()-1));

     return val;

    }



    public static void main(String ar[]) {
     List<String> values =  cavityMap(List.of("1112", "1912", "1892", "1234"));
      //List values =  cavityMap(List.of("989", "191", "111"));
        System.out.println(values);

       // System.out.println(circularArrayRotation(List.of(1,2,3), 2,List.of(0,1,2)));
    }
}
