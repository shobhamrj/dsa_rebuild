import java.util.Arrays;

public class QuickSort {
    
    public static void quickSort(int[] arr, int start, int end) {
        if(end <= start) return;

        int partition = quicksortPartition(arr, start, end);

        quickSort(arr, start, partition - 1);
        quickSort(arr, partition + 1, end);
    }

    public static int quicksortPartition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return;
    }
    
    
    
    public static void main(String[] args) {
        int[] ar= {5,6,6,7,8,4,1};
        quickSort(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
   }
}
