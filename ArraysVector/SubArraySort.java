package ArraysVector;

import java.util.Arrays;

public class SubArraySort {
    // problem statement: find the sub array or two indices of those element in the
    // array, which when sorted gives the sorted array as a whole

    // Brute force
    public static int[] bruteSubArraySort(int[] a) {
        int[] b = a.clone();
        Arrays.sort(b);
        int n = a.length;
        int i = 0;
        int j = n - 1;

        while (i < n && a[i] == b[i])
            i++;

        while (j >= 0 && a[i] == b[i])
            j--;

        if (i == a.length)
            return new int[] { -1, -1 };

        return new int[] { i, j };
    }

    // optimized solution
    // public static int[] optimizedSubArraySort(int[] a) {

    // }
}
