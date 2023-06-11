package Recursion;

import java.util.HashMap;

public class Ladders {
    
     public static void main(String[] args) {
        int n = 4;
        System.out.println(countWays(n));
     }

     private static int countWays(int n) {
          if(n < 0) return 0;
          if(n == 0) return 1;
          return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
     }
}
