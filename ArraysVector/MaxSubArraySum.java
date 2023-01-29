package ArraysVector;

public class MaxSubArraySum {

    // Problem statement: find the maximum subarray sum that can be formed in the given array.
    // Kadane's Algorithm
    public static int kadaneAlgo(int[] arr) {
        int curSum = 0;
        int globalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum = Math.max(curSum, curSum + arr[i]);
            globalSum = Math.max(globalSum, curSum);
        }
        return globalSum;
    }
}