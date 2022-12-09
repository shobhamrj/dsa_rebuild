package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestBand {
    // problem statement largest subset containing consecutive numbers
    public static int findLongestBand(ArrayList<Integer> a) {
        Set<Integer> set = new HashSet<>();
        set.addAll(a); //add all elements inside a set
        int largestLength = 1; 
        for(Integer curElement: set) { // iterate over the array or set
            int prevElement = curElement - 1;
            if(!set.contains(prevElement)) {
                int nextElement = curElement + 1;  //find the entire subset starting with curElement and keep track of count 
                int count = 1;
                while(set.contains(nextElement)) {
                    nextElement++;
                    count++;
                }
                if(count > largestLength) {
                    largestLength = count;
                }
            }
        }
        return largestLength;
    }   
}
