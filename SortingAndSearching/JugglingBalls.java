public class JugglingBalls {
    
    // sort 0's 1's and 2's in a single iteration 
    public static int[] sort(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        
        while (mid <= end) {
            if(arr[mid] == 0) 
                swap(arr, arr[mid++], arr[start++]);
            if (arr[mid] == 2)
                swap(arr, arr[mid], arr[end--]);
            else 
                mid ++;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    
}
