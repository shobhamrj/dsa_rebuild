package BinarySearch;

public class FrequencyCount {
    
    // find the occurrences of x in a sorted array time complexity should be less then O(n)
    public static int count(int[] arr, int x) {
        return lastOccurrence(arr, x) - firstOccurrence(arr, x) + 1;
    }

    private static int lastOccurrence(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int res = -1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == x) {
                res = mid;
                left = mid + 1;
            } 

            else if(arr[mid] > x) right = mid - 1;

            else left = mid + 1;
        }
        return res;
    }

    private static int firstOccurrence (int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int res = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == x) {
                res = mid;
                right = mid - 1; 
            }

            else if(arr[mid] > x) right = mid - 1;

            else left = mid + 1;
        }
        return res;
    }
}
