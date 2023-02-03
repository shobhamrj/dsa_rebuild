package BinarySearch;

public class RotatedSearch {
    // search an element in a rotated sorted array 
    public static int search(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            
            if(arr[mid] == x) return mid; 

            if(arr[start] <= arr[mid]) {
                if(x >= arr[start] && x <= arr[mid]) end = mid - 1;

                else start = mid + 1;
            } 
            
            else {
                if(x >= arr[mid] && x <= arr[end]) start = mid + 1;

                else end = mid - 1;
            }
        }
        return -1;
    }
}
