import java.util.Arrays;

public class SortSubArray {
    
    /*
     * Write a function that takes in an array and returns two integers,
     * denoting starting and ending indices of the smallest subarray in the input 
     * array that needs to be sorted in place so that the entire input is sorted.
     * If the input array is already sorted, return a pair [-1,-1].
    */
    public static int[] minSubArray(int[] arr) {  // Time Complexity O(nlogn) used sorting
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        int i = 0;
        while(i < arr.length && arr[i] == sortedArr[i]) i++;

        int j = arr.length - 1;
        while(j >= 0 && arr[j] == sortedArr[j]) j--;

        if(i == arr.length) return new int[]{-1, -1};

        return new int[] {i, j};
    }

    public static int[] optimizedMinSubArray(int[] arr) { // check if elements are strictly increasing or not, in that find the min and max elements 
        if(arr.length <= 1) return new int[] {-1, -1}; // already sorted
         
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length - 2; i++) {
            if(arr[i] > arr[i + 1] || arr[i] < arr[i - 1]) {
                max = Math.max(arr[i], max);
                min = Math.min(arr[i], min);
            }
        }
        if(min == Integer.MAX_VALUE) return new int[] {-1, -1}; // already sorted

        int i = 0;
        while(i < arr.length && arr[i] <= min) i++;

        int j = arr.length - 1;
        while(j >= 0 && arr[j] >= max) j--;

        return new int[] {i, j};
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 8, 30, 2, 50, 20, 100, 500};
        System.out.println(Arrays.toString((optimizedMinSubArray(arr))));
    }
}