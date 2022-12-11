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
    public static int[] optimizedSubArraySort(int[] a) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++) {
            int x = a[i];
            if(isOutOfOrder(a, i)) {
                smallest = Math.min(smallest, x);
                largest = Math.max(largest, x);
            }
        }
        if(smallest == Integer.MAX_VALUE) return new int[] {-1, -1};

        int left = 0;
        while(smallest >= a[left]) left++;

        int right = a.length - 1;
        while(largest <= a[right]) right--;

        return new int[] {left, right};
    }

    private static boolean isOutOfOrder(int[] a, int i) {
        int x = a[i];

        if(i == 0) return x > a[1];

        if(i == a.length - 1) return x < a[i - 1];

        return x > a[i + 1] || x < a[i - 1];
    }
}
