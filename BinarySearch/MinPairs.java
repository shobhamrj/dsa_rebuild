package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinPairs {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(-1, 5, 10, 20, 3));
        ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(-1, 5, 10, 20, 3));
        minPair(a1,a2);
    }

    public static void minPair(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        Collections.sort(a2);
        int p1 = 0, p2 = 0;
        int diff = Integer.MAX_VALUE;
        for(int x : a1){
            int lb = Collections.binarySearch(a2, x) - a2.get(0);
            if(lb >= 1 && x - a2.get(lb - 1) < diff){
                diff = x - a2.get(lb - 1);
                p2 = x;
                p1 = a2.get(lb-1);
            }
            //greater / right
            if(lb != a2.size() && a2.get(lb) - x < diff){
                diff = a2.get(lb) - x;
                p1 = x;
                p2 = a2.get(lb);
            }
        }
        System.out.println("Min Pair "+p1+" and "+p2);
    }
    
}
