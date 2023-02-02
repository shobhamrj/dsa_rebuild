package BinarySearch;

public class BinarySearch {
    
    public static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == x) return mid;

            else if(arr[mid] > x) right = mid - 1;
            
            else left = mid + 1;
        }

        return -1;
    }
}
