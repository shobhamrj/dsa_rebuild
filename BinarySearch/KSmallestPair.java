package BinarySearch;

import java.util.Arrays;

public class KSmallestPair {
    
    // Leetcode: 719
    public static int findKPair(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        int end =  arr[n - 1] - arr[0];
        int start = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++)
            if(arr[i] - arr[i - 1] < start) start = arr[i] - arr[i - 1];
        

        while(start <= end) {
            int mid = (start + end) / 2;
            int result = countPairs(arr, n, mid);

            if(result < k) start = mid + 1;

            else end = mid - 1;
        }
        return start;    
    }

    private static int countPairs(int[] arr, int n, int mid) {
        int j = 0;
        int count = 0;
        for(int i = 1; i < n; i++) {
            while(arr[i] - arr[j] > mid) j++;
            count += i - j;
        }
        return count;
    }
}
