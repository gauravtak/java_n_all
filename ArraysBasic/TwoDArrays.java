package ArraysBasic;

import java.util.Arrays;

public class TwoDArrays {
   public static void main(String args[]) {
      int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
      for (int i = 0; i < a.length; i++) {
         System.out.println("[");
         for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + ",");
         }
         System.out.println("]");
      }

   }
}
