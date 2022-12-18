package ArraysVector;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayProducts {
    // Implement a function that takes in a vector of integers, 
    //and returns a vector of the same length, where each element 
    // in the output array is equal to the product of every other number in the input array.

    public static int[] findProductArray(int[] arr) {
        int n = arr.length;
        if (n == 1) return new int[] {0};
        int[] res = new int[n];
        Arrays.fill(res, 1);

        int prefix = 1;
        for(int i = 0; i < n; i++) {
            res[i] *= prefix;
            prefix *= arr[i];
        }

        int postFix = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= postFix;
            postFix *= arr[i];
        }
        return res;
    }
}
